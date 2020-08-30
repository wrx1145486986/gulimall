package com.wrx.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 商品阶梯价格
 *
 * @author wangrongxiang
 * @email 1145486986@wrx.com
 * @date 2020-08-26 22:24:15
 */
@Data
@TableName("sms_sku_ladder")
public class SkuLadderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * $column.comments
     */
    @TableId
    private Long id;
    /**
     * $column.comments
     */
    private Long skuId;
    /**
     * $column.comments
     */
    private Integer fullCount;
    /**
     * $column.comments
     */
    private BigDecimal discount;
    /**
     * $column.comments
     */
    private BigDecimal price;
    /**
     * $column.comments
     */
    private Integer addOther;

}
