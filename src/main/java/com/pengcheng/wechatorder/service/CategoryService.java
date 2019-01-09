package com.pengcheng.wechatorder.service;

import com.pengcheng.wechatorder.objectData.ProductCategory;

import java.util.List;

/**
*商品 - 分类
*/
public interface CategoryService {
    /**
    *查询所有
    */
    List<ProductCategory> findAll();
    
    /**
    *查询单个
    */
    ProductCategory findOne(ProductCategory params);
    /**
    *
    */
    
    
    
    
}
