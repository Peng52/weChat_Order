package com.pengcheng.wechatorder.objectData;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
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
    //@Column(name = "CATEGORY_ID")
    private Integer categoryId;
    /**
    *类目名称
    */
    //@Column(name = "CATEGORY_NAME")
    private String categoryName;
    /**
    *类目类型
    */
    //@Column(name = "CATEGORY_TYPE")
    private Integer categoryType;
    /**
    *创建时间
    */
    //@Column(name = "CREATE_TIME")
    private Date createTime;
    /**
    *更新时间
    */
    //@Column(name = "UPDATE_TIME")
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
