package org.smart4j.chapter1.model;

import lombok.Data;

/**
 * @author zzy
 * @desc Customer.class
 * @date 2019/6/1 20:05
 */
@Data
public class Customer {

    /**
     * ID
     */
    private Long id;

    /**
     * 客户名称
     */
    private String name;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 电话号码
     */
    private String telphone;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 备注
     */
    private String remark;
}
