package com.lhf.mall.order.dao;

import com.lhf.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lhf
 * @email luohai521@foxmail.com
 * @date 2020-10-06 22:10:52
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
