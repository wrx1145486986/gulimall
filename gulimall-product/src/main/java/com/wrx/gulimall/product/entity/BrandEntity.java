package com.wrx.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 品牌
 *
 * @author wangrongxiang
 * @email 1145486986@wrx.com
 * @date 2020-08-25 22:59:05
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * $column.comments
     */
    @TableId
    private Long brandId;
    /**
     * $column.comments
     */
    private String name;
    /**
     * $column.comments
     */
    private String logo;
    /**
     * $column.comments
     */
    private String descript;
    /**
     * $column.comments
     */
    private Integer showStatus;
    /**
     * $column.comments
     */
    private String firstLetter;
    /**
     * $column.comments
     */
    private Integer sort;

}
