package com.example.demo.entity.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @USER: DillonPu
 * @DATE: 2020/2/19 15:27
 * @Description:
 * @Version: 1.0.0
 **/
@Data
public class UserInfoDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;

    private String username;
    /**
     * 年龄
     */
    private Integer age;

    /**
     * 省份
     */
    private String province;

    /**
     * 市区名
     */
    private String city;

    /**
     * 性别 1-女 2-男
     */
    private String gender;
}
