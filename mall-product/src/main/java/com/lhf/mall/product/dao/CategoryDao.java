package com.lhf.mall.product.dao;

import com.lhf.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lhf
 * @email luohai521@foxmail.com
 * @date 2020-10-06 15:40:42
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
