package com.pengcheng.wechatorder.categoryService;

import com.pengcheng.wechatorder.WechatOrderApplicationTests;
import com.pengcheng.wechatorder.objectData.ProductCategory;
import com.pengcheng.wechatorder.repository.ProductCategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: wechat-order
 * @description: 类目测试
 * @author: peng
 * @create: 2019-01-10 21:08
 **/
@Slf4j
public class CategoryServiceTest extends WechatOrderApplicationTests {
    @Autowired
    private ProductCategoryRepository categoryRepository;
    //categoryServiceImpl 测试
    @Test
    public void test1(){
        List<Integer>  types = new ArrayList<>();
        types.add(11);
        types.add(22);
        types.add(20);
        List<ProductCategory> categorys = categoryRepository.findByCategoryTypeIn(types);
        log.info("根据类目查询" +categorys );
    }



}

