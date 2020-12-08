package com.lhf.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lhf.common.utils.PageUtils;
import com.lhf.mall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author lhf
 * @email luohai521@foxmail.com
 * @date 2020-10-06 22:10:52
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

