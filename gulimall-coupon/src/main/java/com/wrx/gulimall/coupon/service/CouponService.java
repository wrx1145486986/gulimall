package com.wrx.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wrx.common.utils.PageUtils;
import com.wrx.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author wangrongxiang
 * @email 1145486986@wrx.com
 * @date 2020-08-26 22:24:16
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

