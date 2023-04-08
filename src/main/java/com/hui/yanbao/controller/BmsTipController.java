package com.hui.yanbao.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.hui.yanbao.common.api.ApiResult;
import com.hui.yanbao.model.entity.BmsBillboard;
import com.hui.yanbao.model.entity.BmsTip;
import com.hui.yanbao.service.IBmsBillboardService;
import com.hui.yanbao.service.IBmsTipService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/tip")
public class BmsTipController extends BaseController {
    @Resource
    private IBmsTipService bmsTipService;

    @GetMapping("/today")
    public ApiResult<BmsTip> getRandomTip() {
        BmsTip tip = bmsTipService.getRandomTip();
        return ApiResult.success(tip);
    }
}
