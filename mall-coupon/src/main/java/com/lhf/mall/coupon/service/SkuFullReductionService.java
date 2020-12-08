package com.lhf.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lhf.common.utils.PageUtils;
import com.lhf.mall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author lhf
 * @email luohai521@foxmail.com
 * @date 2020-10-06 16:48:21
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

