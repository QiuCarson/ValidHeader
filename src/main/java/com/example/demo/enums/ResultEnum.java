package com.example.demo.enums;

import lombok.Getter;

/**
 * @Author: qiuyisong
 * @Date: 2019/9/17 14:28
 */
@Getter
public enum ResultEnum {
    SUCCESS("0", "成功"),
    PARM_ERROR("1000", "参数错误"),
    UNKNOWN_ERROR("9999", "系统异常"),;
    private String code;
    private String message;


    ResultEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
