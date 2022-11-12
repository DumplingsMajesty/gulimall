package com.atguigu.gulimail.product.dao;

import com.atguigu.gulimail.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author Dumplings Majesty
 * @email dumplings.majesty@gmail.com
 * @date 2022-11-11 23:12:50
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
