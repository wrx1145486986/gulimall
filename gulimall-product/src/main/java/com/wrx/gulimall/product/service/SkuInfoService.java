package com.wrx.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wrx.common.utils.PageUtils;
import com.wrx.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author wangrongxiang
 * @email 1145486986@wrx.com
 * @date 2020-08-25 22:59:05
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

