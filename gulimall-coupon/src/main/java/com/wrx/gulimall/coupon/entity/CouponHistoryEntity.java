package com.wrx.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 优惠券领取历史记录
 *
 * @author wangrongxiang
 * @email 1145486986@wrx.com
 * @date 2020-08-26 22:24:16
 */
@Data
@TableName("sms_coupon_history")
public class CouponHistoryEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * $column.comments
     */
    @TableId
    private Long id;
    /**
     * $column.comments
     */
    private Long couponId;
    /**
     * $column.comments
     */
    private Long memberId;
    /**
     * $column.comments
     */
    private String memberNickName;
    /**
     * $column.comments
     */
    private Integer getType;
    /**
     * $column.comments
     */
    private Date createTime;
    /**
     * $column.comments
     */
    private Integer useType;
    /**
     * $column.comments
     */
    private Date useTime;
    /**
     * $column.comments
     */
    private Long orderId;
    /**
     * $column.comments
     */
    private Long orderSn;

}
