package com.wrx.gulimall.order.dao;

import com.wrx.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 *
 * @author wangrongxiang
 * @email 1145486986@wrx.com
 * @date 2020-08-26 22:57:46
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {

}
