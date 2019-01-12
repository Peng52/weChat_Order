package com.pengcheng.wechatorder.service.imple;

import com.pengcheng.wechatorder.enums.ProductInfoStatusEnums;
import com.pengcheng.wechatorder.objectData.ProductInfo;

import com.pengcheng.wechatorder.repository.ProductInfoRepository;
import com.pengcheng.wechatorder.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: wechat-order
 * @description: 商品
 * @author: peng
 * @create: 2019-01-10 23:30
 **/
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoRepository productReository;

    /**
    *商品 - 查找单个
    */

    @Override
    public ProductInfo findOne(ProductInfo product) {
       return productReository.findById(product.getProductId()).get();
    }
    /**
    *商品 - 查询所有
    */

    @Override
    public List<ProductInfo> findUpAll() {
        return productReository.findByProductStatusIs(ProductInfoStatusEnums.UP.getCode());
    }
    /**
    *商品 列表  - 分页
    */

    @Override
    public Page<ProductInfo> findAllListPage(Pageable page) {
        return productReository.findAll(page);
    }
    /**
    *保存或更新
    */

    @Override
    public ProductInfo save(ProductInfo product) {
        return productReository.save(product);
    }
}
