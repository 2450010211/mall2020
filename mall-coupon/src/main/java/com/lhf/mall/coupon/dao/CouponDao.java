package com.lhf.mall.coupon.dao;

import com.lhf.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lhf
 * @email luohai521@foxmail.com
 * @date 2020-10-06 16:48:21
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
