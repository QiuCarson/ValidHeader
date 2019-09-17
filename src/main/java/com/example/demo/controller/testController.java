package com.example.demo.controller;

import com.example.demo.annotation.ValidHeader;
import com.example.demo.enums.ResultEnum;
import com.example.demo.utils.ResultUtil;
import com.example.demo.vo.DemoVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: qiuyisong
 * @Date: 2019/9/17 10:42
 */
@RestController
public class testController {

    @ValidHeader
    @GetMapping("/test")
    public String test(){
        return "access";
    }

    @ValidHeader
    @PostMapping("/test1")
    public DemoVO test1(){
        return ResultUtil.success();
    }
}
