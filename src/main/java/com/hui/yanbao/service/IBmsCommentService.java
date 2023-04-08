package com.hui.yanbao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hui.yanbao.model.dto.CommentDTO;
import com.hui.yanbao.model.entity.BmsComment;
import com.hui.yanbao.model.entity.UmsUser;
import com.hui.yanbao.model.vo.CommentVO;

import java.util.List;


public interface IBmsCommentService extends IService<BmsComment> {
    /**
     *
     *
     * @param topicid
     * @return {@link BmsComment}
     */
    List<CommentVO> getCommentsByTopicID(String topicid);

    BmsComment create(CommentDTO dto, UmsUser principal);
}
