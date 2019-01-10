package com.pengcheng.wechatorder.service.imple;

import com.pengcheng.wechatorder.objectData.ProductCategory;
import com.pengcheng.wechatorder.repository.ProductCategoryRepository;
import com.pengcheng.wechatorder.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: wechat-order
 * @description: 商品分类
 * @author: peng
 * @create: 2019-01-08 23:45
 **/
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private ProductCategoryRepository categoryRepository;

    /**
     * 查询所有
     */
    @Override
    public List<ProductCategory> findAll() {
        return categoryRepository.findAll();
    }

    /**
     * 查询单个
     */
    @Override
    public ProductCategory findOne(ProductCategory params) {
        return categoryRepository.findById(params.getCategoryId()).get();
    }

    /**
     * 指定的类目查找
     */

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> types) {
        return categoryRepository.findByCategoryTypeIn(types);
    }

    /**
     * 保存和更新操作
     */
    @Override
    public void save(ProductCategory category) {
        categoryRepository.save(category);
    }
}
