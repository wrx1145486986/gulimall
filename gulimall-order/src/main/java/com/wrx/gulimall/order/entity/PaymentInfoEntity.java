package com.wrx.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 支付信息表
 *
 * @author wangrongxiang
 * @email 1145486986@wrx.com
 * @date 2020-08-26 22:57:47
 */
@Data
@TableName("oms_payment_info")
public class PaymentInfoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * $column.comments
     */
    @TableId
    private Long id;
    /**
     * $column.comments
     */
    private String orderSn;
    /**
     * $column.comments
     */
    private Long orderId;
    /**
     * $column.comments
     */
    private String alipayTradeNo;
    /**
     * $column.comments
     */
    private BigDecimal totalAmount;
    /**
     * $column.comments
     */
    private String subject;
    /**
     * $column.comments
     */
    private String paymentStatus;
    /**
     * $column.comments
     */
    private Date createTime;
    /**
     * $column.comments
     */
    private Date confirmTime;
    /**
     * $column.comments
     */
    private String callbackContent;
    /**
     * $column.comments
     */
    private Date callbackTime;

}
