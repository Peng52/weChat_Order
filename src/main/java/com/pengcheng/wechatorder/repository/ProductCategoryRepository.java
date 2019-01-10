package com.pengcheng.wechatorder.repository;

import com.pengcheng.wechatorder.objectData.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
    /**
    *查找指定的类目  list
    */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> types);





}
