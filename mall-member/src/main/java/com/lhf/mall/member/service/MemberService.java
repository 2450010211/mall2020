package com.lhf.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lhf.common.utils.PageUtils;
import com.lhf.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author lhf
 * @email luohai521@foxmail.com
 * @date 2020-10-06 22:02:09
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

