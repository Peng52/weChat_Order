package com.pengcheng.wechatorder.cotroller;

import com.pengcheng.wechatorder.objectData.ProductCategory;
import com.pengcheng.wechatorder.objectData.ProductInfo;
import com.pengcheng.wechatorder.service.CategoryService;
import com.pengcheng.wechatorder.service.ProductInfoService;
import com.pengcheng.wechatorder.vo.ProductInfoVO;
import com.pengcheng.wechatorder.vo.ProductVO;
import com.pengcheng.wechatorder.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: wechat-order
 * @description: 卖家端商品
 * @author: peng
 * @create: 2019-01-12 14:30
 **/
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
    @Autowired
    private ProductInfoService productInfoService;
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public R findProductAll() {
        List<ProductVO> list = new ArrayList<>();
        List<ProductInfo> productInfoList = productInfoService.findUpAll();
        List<Integer> categoryType = productInfoList.stream().map(t -> t.getCategoryType()).collect(Collectors.toList());
        List<ProductCategory> categoryList = categoryService.findByCategoryTypeIn(categoryType);
        for (ProductCategory pc : categoryList) {
            ProductVO productVO = new ProductVO();
            list.add(productVO);
            productVO.setCategoryName(pc.getCategoryName());
            productVO.setCategoryType(pc.getCategoryType());
            for (ProductInfo info : productInfoList) {
                if (info.getCategoryType() != null && info.getCategoryType().equals(pc.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    productInfoVO.setProductId(info.getProductId());
                    productInfoVO.setProductName(info.getProductName());
                    productInfoVO.setProductPrice(info.getProductPrice());
                    productInfoVO.setProductIcon(info.getProductIcon());
                    productInfoVO.setProductDescription(info.getProductDescription());
                    productVO.getProductInfoList().add(productInfoVO);
                }
            }
        }
        return R.ok().putMap("result", list);
    }


}
