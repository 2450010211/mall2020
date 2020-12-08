package com.lhf.mall.member.dao;

import com.lhf.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lhf
 * @email luohai521@foxmail.com
 * @date 2020-10-06 22:02:09
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
