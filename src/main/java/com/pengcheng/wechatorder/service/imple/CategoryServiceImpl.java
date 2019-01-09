package com.pengcheng.wechatorder.service.imple;

import com.pengcheng.wechatorder.objectData.ProductCategory;
import com.pengcheng.wechatorder.repository.ProductCategoryRepository;
import com.pengcheng.wechatorder.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: wechat-order
 * @description: 商品分类
 * @author: peng
 * @create: 2019-01-08 23:45
 **/

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private ProductCategoryRepository categoryRepository;

    /**
    *查询所有
    */
    @Override
    public List<ProductCategory> findAll() {
        return categoryRepository.findAll();
    }
    /**
    *查询单个
    */
    @Override
    public ProductCategory findOne(ProductCategory params) {
       //???
        return categoryRepository.findById(params.getCategoryId()).get();
    }


}
