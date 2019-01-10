package com.pengcheng.wechatorder.enums;

import com.pengcheng.wechatorder.objectData.ProductInfo;
import lombok.Getter;

/**
 * @program: wechat-order
 * @description: 商品上架和下架
 * @author: peng
 * @create: 2019-01-11 00:09
 **/
@Getter

public enum ProductInfoStatusEnums {
    UP(0,"上架"),DOWN(1,"下架");

    private Integer code;
    private String  message;
    ProductInfoStatusEnums(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
