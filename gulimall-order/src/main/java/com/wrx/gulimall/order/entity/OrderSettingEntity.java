package com.wrx.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 订单配置信息
 *
 * @author wangrongxiang
 * @email 1145486986@wrx.com
 * @date 2020-08-26 22:57:47
 */
@Data
@TableName("oms_order_setting")
public class OrderSettingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * $column.comments
     */
    @TableId
    private Long id;
    /**
     * $column.comments
     */
    private Integer flashOrderOvertime;
    /**
     * $column.comments
     */
    private Integer normalOrderOvertime;
    /**
     * $column.comments
     */
    private Integer confirmOvertime;
    /**
     * $column.comments
     */
    private Integer finishOvertime;
    /**
     * $column.comments
     */
    private Integer commentOvertime;
    /**
     * $column.comments
     */
    private Integer memberLevel;

}
