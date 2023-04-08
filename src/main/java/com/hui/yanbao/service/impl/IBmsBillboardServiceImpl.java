package com.hui.yanbao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hui.yanbao.mapper.BmsBillboardMapper;
import com.hui.yanbao.model.entity.BmsBillboard;
import com.hui.yanbao.service.IBmsBillboardService;
import org.springframework.stereotype.Service;

@Service
public class IBmsBillboardServiceImpl extends ServiceImpl<BmsBillboardMapper
        , BmsBillboard> implements IBmsBillboardService {

}
