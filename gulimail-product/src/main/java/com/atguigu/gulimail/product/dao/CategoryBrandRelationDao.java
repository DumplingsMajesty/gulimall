package com.atguigu.gulimail.product.dao;

import com.atguigu.gulimail.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author Dumplings Majesty
 * @email dumplings.majesty@gmail.com
 * @date 2022-11-11 23:12:50
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
	
}
