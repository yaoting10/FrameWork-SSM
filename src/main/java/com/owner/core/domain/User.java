package com.owner.core.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.owner.website.controller.vo.UserVo;
import lombok.Data;

import java.io.Serializable;

/**
 * Created with PMS
 * User : Tim.Yao
 * Date : 2016/8/16.
 */
@Data
public class User implements Serializable{


    @JsonProperty("id")
    private int id;

    @JsonProperty("userNumber")
    private String userNumber;

    @JsonProperty("userName")
    private String userName;

    @JsonProperty("password")
    private String password;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("userType")
    private int userType;

    @JsonProperty("userSex")
    private int userSex;

    @JsonProperty("idCard")
    private String idCard;


    public static User of(UserVo userVo){
        User user = new User();
        user.setIdCard(userVo.getIdCard());
        user.setPassword(userVo.getPassword());
        user.setPhone(userVo.getPhone());
        user.setUserName(userVo.getUserName());
        user.setUserSex(userVo.getUserSex());
        user.setUserNumber(userVo.getUserNumber());
        user.setUserType(userVo.getUserType());
        return user;
    }
}
