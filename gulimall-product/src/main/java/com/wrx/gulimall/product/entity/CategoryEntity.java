package com.wrx.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 商品三级分类
 *
 * @author wangrongxiang
 * @email 1145486986@wrx.com
 * @date 2020-08-25 22:59:05
 */
@Data
@Accessors(chain = true)
@TableName("pms_category")
public class CategoryEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * $column.comments
     */
    @TableId
    private Long catId;
    /**
     * $column.comments
     */
    private String name;
    /**
     * $column.comments
     */
    private Long parentCid;
    /**
     * $column.comments
     */
    private Integer catLevel;
    /**
     * $column.comments
     */
    private Integer showStatus;
    /**
     * $column.comments
     */
    private Integer sort;
    /**
     * $column.comments
     */
    private String icon;
    /**
     * $column.comments
     */
    private String productUnit;
    /**
     * $column.comments
     */
    private Integer productCount;

    /**
     * 子节点
     */
    @TableField(exist = false)
    private List<CategoryEntity> children;
}
