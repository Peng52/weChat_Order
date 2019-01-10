package com.pengcheng.wechatorder.service.imple;

import com.pengcheng.wechatorder.enums.ProductInfoStatusEnums;
import com.pengcheng.wechatorder.objectData.ProductInfo;

import com.pengcheng.wechatorder.repository.ProductInfoRepository;
import com.pengcheng.wechatorder.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @program: wechat-order
 * @description: 商品
 * @author: peng
 * @create: 2019-01-10 23:30
 **/

public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoRepository productReository;


    @Override
    public ProductInfo findOne(ProductInfo product) {
       return productReository.findById(product.getProductId()).get();
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return productReository.findByProductStatusIs(ProductInfoStatusEnums.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAllListPage(Pageable page) {
        return productReository.findAll(page);
    }

    @Override
    public ProductInfo save(ProductInfo product) {
        return productReository.save(product);
    }
}
