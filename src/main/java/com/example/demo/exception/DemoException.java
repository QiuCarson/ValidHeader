package com.example.demo.exception;

import com.example.demo.enums.ResultEnum;
import lombok.Data;

@Data
public class DemoException extends RuntimeException{
    private String code;
 
    public DemoException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code=resultEnum.getCode();
    }

 
}