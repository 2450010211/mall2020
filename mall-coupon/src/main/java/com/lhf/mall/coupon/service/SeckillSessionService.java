package com.lhf.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lhf.common.utils.PageUtils;
import com.lhf.mall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author lhf
 * @email luohai521@foxmail.com
 * @date 2020-10-06 16:48:21
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

