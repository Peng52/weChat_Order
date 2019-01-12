package com.pengcheng.wechatorder.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @program: wechat-order
 * @description: 商品详情
 * @author: peng
 * @create: 2019-01-12 16:55
 **/

@Getter
@Setter
public class ProductInfoVO  {
    
    /**
    *商品ID
    */
    @JsonProperty("ID")
    private String productId;
    /**
    *商品的名称
    */
    @JsonProperty("name")
    private String productName;
    /**
    *商品价格
    */
    @JsonProperty("price")
    private BigDecimal productPrice;
    /**
    *商品描述
    */
    @JsonProperty("description")
    private String productDescription;
    /**
    *商品小图
    */
    @JsonProperty("icon")
    private String productIcon;

}
