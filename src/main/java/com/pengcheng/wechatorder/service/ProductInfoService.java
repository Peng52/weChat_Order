package com.pengcheng.wechatorder.service;

import com.pengcheng.wechatorder.objectData.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @program: wechat-order
 * @description: 商品
 * @author: peng
 * @create: 2019-01-10 23:21
 **/
public interface ProductInfoService {
    /**
    *查询单个商品
    */
    ProductInfo findOne(ProductInfo product);
    /**
    *查询所有上架的商品
    */
    List<ProductInfo> findUpAll();

    /**
    *查询所有的商品 - 分页
    */
    Page<ProductInfo> findAllListPage(Pageable page);
    /**
    *保存 - 更新
    */
     ProductInfo save(ProductInfo product);
    //加库存
    //减库存


}
