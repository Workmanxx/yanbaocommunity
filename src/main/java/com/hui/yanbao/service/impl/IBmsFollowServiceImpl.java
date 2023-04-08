package com.hui.yanbao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hui.yanbao.mapper.BmsFollowMapper;
import com.hui.yanbao.model.entity.BmsFollow;
import com.hui.yanbao.service.IBmsFollowService;
import org.springframework.stereotype.Service;


@Service
public class IBmsFollowServiceImpl extends ServiceImpl<BmsFollowMapper, BmsFollow> implements IBmsFollowService {
}
