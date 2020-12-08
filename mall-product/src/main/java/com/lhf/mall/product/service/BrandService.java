package com.lhf.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lhf.common.utils.PageUtils;
import com.lhf.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author lhf
 * @email luohai521@foxmail.com
 * @date 2020-10-06 15:40:42
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

