package com.wrx.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 属性分组
 *
 * @author wangrongxiang
 * @email 1145486986@wrx.com
 * @date 2020-08-25 22:59:05
 */
@Data
@TableName("pms_attr_group")
public class AttrGroupEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * $column.comments
     */
    @TableId
    private Long attrGroupId;
    /**
     * $column.comments
     */
    private String attrGroupName;
    /**
     * $column.comments
     */
    private Integer sort;
    /**
     * $column.comments
     */
    private String descript;
    /**
     * $column.comments
     */
    private String icon;
    /**
     * $column.comments
     */
    private Long catelogId;

}
