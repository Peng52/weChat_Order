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
    *指定类目查找
    */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> types);
    /**
    *保存、更新操作
    */
    void save(ProductCategory category);


    
    
    
    
}
