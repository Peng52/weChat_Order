package com.pengcheng.wechatorder.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: wechat-order
 * @description: 商品
 * @author: peng
 * @create: 2019-01-12 16:49
 **/

@Getter
@Setter
public class ProductVO {
    /**
    *类目名称
    */
    @JsonProperty(value = "name")
    private String categoryName;
    
    /**
    *类目类型
    */
    @JsonProperty("type")
    private Integer categoryType;
    /**
    *该类目下的商品
    */
    @JsonProperty("food")
    private List<ProductInfoVO> productInfoList = new ArrayList<>();


}
