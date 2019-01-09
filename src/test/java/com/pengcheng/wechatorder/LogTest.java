package com.pengcheng.wechatorder;


import com.pengcheng.wechatorder.objectData.ProductCategory;
import com.pengcheng.wechatorder.repository.ProductCategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
public class LogTest extends WechatOrderApplicationTests {
    @Autowired
    private ProductCategoryRepository repository;

    private String name = "Jack";
    private Long age = 19L;
    //logback日志的使用
    @Test
    public void test1(){

        log.info("info....中的消息");
        log.debug("debug...消息");
        log.error("error..错误提示");
        //日志中变量的两种传入方式
        log.error("姓名：{},年龄：{}",name,age);
        log.error("姓名 "+name+" 年龄 "+age);

    }
    //JPA 测试
    @Test
    public void test2(){
        //新增
        ProductCategory category = new ProductCategory();
        category.setCategoryName("家用电器");
        category.setCategoryType(1);
        repository.save(category);
    }
    //数据库中自动生成 create_time 与update_time 测试
    @Test
    @Transactional
    public void test3(){

        /*List<ProductCategory> all = repository.findAll();
        log.info("打印："+ all.get(0));
        //什么不做改动直接update
        log.info("取第一个值："+all.get(0).getCategoryId());
        //如果直接取到一条记录后，直接saveAndFlush()
        all.get(0).setCategoryName("电脑");
        //那么数据库中的updateTime 不会更新
        //只有这条记录发生了改变才会更新updateTime
        repository.saveAndFlush(all.get(0));*/


        ProductCategory category = new ProductCategory();
        category.setCategoryId(2);
        category.setCategoryName("江南");

        repository.saveAndFlush(category);

    }





}
