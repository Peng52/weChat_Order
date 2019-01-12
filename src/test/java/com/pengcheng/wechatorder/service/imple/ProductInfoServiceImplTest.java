package com.pengcheng.wechatorder.service.imple;

import com.pengcheng.wechatorder.WechatOrderApplicationTests;
import com.pengcheng.wechatorder.objectData.ProductInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

@Slf4j
public class ProductInfoServiceImplTest extends WechatOrderApplicationTests {
    @Autowired
    private ProductInfoServiceImpl productInfoService;


    @Test
    public void findOne() {

    }
    @Test
    public void findUpAll() {
    }
    /**
    *商品 列表 - 分页
    */

    @Test
    public void findAllListPage() {
        PageRequest pageRequest = PageRequest.of(0, 2);

        Page<ProductInfo> productInfoPage = productInfoService.findAllListPage(pageRequest);

        List<String> collect = productInfoPage.stream().map(t -> t.getProductId()).collect(Collectors.toList());
        log.info("商品分页 ："+productInfoPage.getContent().stream().map(t->t.getProductId()).collect(Collectors.toList()) );


    }
    //保存操作
    @Test
    public void save() {
            ProductInfo productInfo = new ProductInfo();
            productInfo.setCategoryType(55);
            productInfo.setProductId("12355");
            //productInfo.setCreateTime(LocalDate.now());
            productInfo.setProductDescription("骁龙845");
            productInfo.setProductIcon("http://xxxx.com");
            productInfo.setProductName("小米8");
            productInfo.setProductPrice(new BigDecimal(2999.99));
            productInfo.setProductStock(999);
            productInfo.setProductStatus(0);
            productInfoService.save(productInfo);
        }
    }
