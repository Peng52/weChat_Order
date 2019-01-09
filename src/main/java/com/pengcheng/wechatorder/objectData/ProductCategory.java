package com.pengcheng.wechatorder.objectData;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ProductCategory {
    /**
    *ID
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer categoryId;
    /**
    *类目名称
    */
    private String categoryName;
    /**
    *类目类型
    */
    private Integer categoryType;
    /**
    *创建时间
    */
    private Date createTime;
    /**
    *更新时间
    */
    private Date updateTime;

    @Override
    public String toString() {
        return "ProductCategory{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryType=" + categoryType +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
