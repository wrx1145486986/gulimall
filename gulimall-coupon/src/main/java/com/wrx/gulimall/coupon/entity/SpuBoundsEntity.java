package com.wrx.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 商品spu积分设置
 *
 * @author wangrongxiang
 * @email 1145486986@wrx.com
 * @date 2020-08-26 22:24:15
 */
@Data
@TableName("sms_spu_bounds")
public class SpuBoundsEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * $column.comments
     */
    @TableId
    private Long id;
    /**
     * $column.comments
     */
    private Long spuId;
    /**
     * $column.comments
     */
    private BigDecimal growBounds;
    /**
     * $column.comments
     */
    private BigDecimal buyBounds;
    /**
     * $column.comments
     */
    private Integer work;

}
