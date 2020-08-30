package com.wrx.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * spu图片
 *
 * @author wangrongxiang
 * @email 1145486986@wrx.com
 * @date 2020-08-25 22:59:04
 */
@Data
@TableName("pms_spu_images")
public class SpuImagesEntity implements Serializable {
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
    private String imgName;
    /**
     * $column.comments
     */
    private String imgUrl;
    /**
     * $column.comments
     */
    private Integer imgSort;
    /**
     * $column.comments
     */
    private Integer defaultImg;

}
