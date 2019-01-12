package com.pengcheng.wechatorder.objectData;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

/**
 * @program: wechat-order
 * @description: 商品
 * @author: peng
 * @create: 2019-01-10 21:24
 **/
@Entity
@Data
@DynamicUpdate
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
    *商品的状态 0 上架 1 下架
    */
    private Integer productStatus;
    /**
    *创建时间
    */
/*    @Column(columnDefinition="TIMESTAMP", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)*/
    private Date createTime;
    /**
    *更新时间
    */
/*    @Column(columnDefinition="TIMESTAMP", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)*/
    private Date updateTime;



}
