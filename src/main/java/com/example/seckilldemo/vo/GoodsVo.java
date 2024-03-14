package com.example.seckilldemo.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.example.seckilldemo.entity.TGoods;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品返回对象
 *
 * @author: LC
 * @date 2022/3/3 5:43 下午
 * @ClassName: GoodsVo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("商品返回对象")
public class  GoodsVo extends TGoods {

    private static final long serialVersionUID = 1L;

    /** 商品ID **/
    @ApiModelProperty("商品ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /** 商品名称 **/
    @ApiModelProperty("商品名称")
    private String goodsName;

    /** 商品标题 **/
    @ApiModelProperty("商品标题")
    private String goodsTitle;

    /** 商品图片 **/
    @ApiModelProperty("商品图片")
    private String goodsImg;

    /** 商品详情 **/
    @ApiModelProperty("商品详情")
    private String goodsDetail;

    /** 商品价格 **/
    @ApiModelProperty("商品价格")
    private BigDecimal goodsPrice;

    /** 商品库存，-1表示没有限制 **/
    @ApiModelProperty("商品库存，-1表示没有限制")
    private Integer goodsStock;

    /**
     * 秒杀价格
     **/
    @ApiModelProperty("秒杀价格")
    private BigDecimal seckillPrice;

    /**
     * 剩余数量
     **/
    @ApiModelProperty("剩余数量")
    private Integer stockCount;

    /**
     * 开始时间
     **/
    @ApiModelProperty("开始时间")
    private Date startDate;

    /**
     * 结束时间
     **/
    @ApiModelProperty("结束时间")
    private Date endDate;


}
