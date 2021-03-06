package com.wrx.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 秒杀活动
 *
 * @author wangrongxiang
 * @email 1145486986@wrx.com
 * @date 2020-08-26 22:24:16
 */
@Data
@TableName("sms_seckill_promotion")
public class SeckillPromotionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * $column.comments
     */
    @TableId
    private Long id;
    /**
     * $column.comments
     */
    private String title;
    /**
     * $column.comments
     */
    private Date startTime;
    /**
     * $column.comments
     */
    private Date endTime;
    /**
     * $column.comments
     */
    private Integer status;
    /**
     * $column.comments
     */
    private Date createTime;
    /**
     * $column.comments
     */
    private Long userId;

}
