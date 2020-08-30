package com.wrx.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wrx.common.utils.PageUtils;
import com.wrx.gulimall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author wangrongxiang
 * @email 1145486986@wrx.com
 * @date 2020-08-26 22:24:16
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

