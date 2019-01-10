package com.pengcheng.wechatorder.repository;

import com.pengcheng.wechatorder.objectData.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * @program: wechat-order
 * @description: 商品
 * @author: peng
 * @create: 2019-01-10 22:32
 **/
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    /**
    *根据商品的状态查询列表
    */
    List<ProductInfo> findByProductStatusIs(Integer status);



}
