package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author Dumplings Majesty
 * @email dumplings.majesty@gmail.com
 * @date 2022-11-23 16:05:27
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
