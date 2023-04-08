package com.hui.yanbao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hui.yanbao.model.entity.BmsTip;

public interface IBmsTipService extends IService<BmsTip> {
    BmsTip getRandomTip();
}
