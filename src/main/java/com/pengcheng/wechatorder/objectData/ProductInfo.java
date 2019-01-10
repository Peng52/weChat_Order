package com.pengcheng.wechatorder.objectData;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @program: wechat-order
 * @description: 商品
 * @author: peng
 * @create: 2019-01-10 21:24
 **/
@Entity
@Data
public class ProductInfo {
    /**
    *商品ID
    */
    @Id
    private String productId;
    /**
    *商品的价格
    */
    private BigDecimal productPrice;
    /**
    *商品的名称
    */
    private String productName;
    /**
    *商品的库存
    */
    private Integer productStock;
    /**
    *所属的类别
    */
    private Integer categoryType;
    /**
    *商品小图
    */
    private String productIcon;
    /**
    *商品的描述
    */
    private String productDescription;
    /**
    *创建时间
    */
    private LocalDate createTime;
    /**
    *更新时间
    */
    private LocalDate updateTime;



}
