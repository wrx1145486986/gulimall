package com.wrx.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 会员统计信息
 *
 * @author wangrongxiang
 * @email 1145486986@wrx.com
 * @date 2020-08-26 22:40:45
 */
@Data
@TableName("ums_member_statistics_info")
public class MemberStatisticsInfoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * $column.comments
     */
    @TableId
    private Long id;
    /**
     * $column.comments
     */
    private Long memberId;
    /**
     * $column.comments
     */
    private BigDecimal consumeAmount;
    /**
     * $column.comments
     */
    private BigDecimal couponAmount;
    /**
     * $column.comments
     */
    private Integer orderCount;
    /**
     * $column.comments
     */
    private Integer couponCount;
    /**
     * $column.comments
     */
    private Integer commentCount;
    /**
     * $column.comments
     */
    private Integer returnOrderCount;
    /**
     * $column.comments
     */
    private Integer loginCount;
    /**
     * $column.comments
     */
    private Integer attendCount;
    /**
     * $column.comments
     */
    private Integer fansCount;
    /**
     * $column.comments
     */
    private Integer collectProductCount;
    /**
     * $column.comments
     */
    private Integer collectSubjectCount;
    /**
     * $column.comments
     */
    private Integer collectCommentCount;
    /**
     * $column.comments
     */
    private Integer inviteFriendCount;

}
