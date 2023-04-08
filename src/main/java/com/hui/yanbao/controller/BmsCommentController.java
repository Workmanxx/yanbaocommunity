package com.hui.yanbao.controller;

import com.hui.yanbao.common.api.ApiResult;
import com.hui.yanbao.model.dto.CommentDTO;
import com.hui.yanbao.model.entity.BmsComment;
import com.hui.yanbao.model.entity.UmsUser;
import com.hui.yanbao.model.vo.CommentVO;
import com.hui.yanbao.service.IBmsCommentService;
import com.hui.yanbao.service.IUmsUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

import static com.hui.yanbao.jwt.JwtUtil.USER_NAME;


@RestController
@RequestMapping("/comment")
public class BmsCommentController extends BaseController {

    @Resource
    private IBmsCommentService bmsCommentService;
    @Resource
    private IUmsUserService umsUserService;

    @GetMapping("/get_comments")
    public ApiResult<List<CommentVO>> getCommentsByTopicID(@RequestParam(value = "topicid", defaultValue = "1") String topicid) {
        List<CommentVO> lstBmsComment = bmsCommentService.getCommentsByTopicID(topicid);
        return ApiResult.success(lstBmsComment);
    }
    @PostMapping("/add_comment")
    public ApiResult<BmsComment> add_comment(@RequestHeader(value = USER_NAME) String userName,
                                             @RequestBody CommentDTO dto) {
        UmsUser user = umsUserService.getUserByUsername(userName);
        BmsComment comment = bmsCommentService.create(dto, user);
        return ApiResult.success(comment);
    }
}
