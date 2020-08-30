package com.wrx.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wrx.common.utils.PageUtils;
import com.wrx.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author wangrongxiang
 * @email 1145486986@wrx.com
 * @date 2020-08-26 23:02:36
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

