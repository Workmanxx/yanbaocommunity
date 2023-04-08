package com.hui.yanbao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hui.yanbao.mapper.BmsBillboardMapper;
import com.hui.yanbao.mapper.BmsTipMapper;
import com.hui.yanbao.model.entity.BmsBillboard;
import com.hui.yanbao.model.entity.BmsTip;
import com.hui.yanbao.service.IBmsBillboardService;
import com.hui.yanbao.service.IBmsTipService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class IBmsTipServiceImpl extends ServiceImpl<BmsTipMapper
        , BmsTip> implements IBmsTipService {

    @Override
    public BmsTip getRandomTip() {
        BmsTip todayTip = null;
        try {
            todayTip = this.baseMapper.getRandomTip();
        } catch (Exception e) {
            log.info("tip转化失败");
        }
        return todayTip;
    }
}
