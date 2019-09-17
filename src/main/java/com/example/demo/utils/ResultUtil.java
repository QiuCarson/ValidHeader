package com.example.demo.utils;

import com.example.demo.enums.ResultEnum;
import com.example.demo.vo.DemoVO;

public class ResultUtil {
    public static DemoVO success() {
        DemoVO DemoVO = new DemoVO();
        DemoVO.setCode(Integer.valueOf(ResultEnum.SUCCESS.getCode()));
        DemoVO.setMessage(ResultEnum.SUCCESS.getMessage());
        return DemoVO;
    }

    public static DemoVO success(Object data) {
        DemoVO DemoVO = new DemoVO();
        DemoVO.setCode(Integer.valueOf(ResultEnum.SUCCESS.getCode()));
        DemoVO.setMessage(ResultEnum.SUCCESS.getMessage());
        DemoVO.setData(data);
        return DemoVO;
    }

    public static DemoVO error(String code, String message, Object data) {
        DemoVO DemoVO = new DemoVO();
        DemoVO.setCode(Integer.valueOf(code));
        DemoVO.setMessage(message);
        DemoVO.setData(data);
        return DemoVO;
    }


    public static DemoVO error(String code, String message) {
        DemoVO DemoVO = new DemoVO();
        DemoVO.setCode(Integer.valueOf(code));
        DemoVO.setMessage(message);
        return DemoVO;
    }

    public static DemoVO error(ResultEnum resultEnum) {
        DemoVO DemoVO = new DemoVO();
        DemoVO.setCode(Integer.valueOf(resultEnum.getCode()));
        DemoVO.setMessage(resultEnum.getMessage());
        return DemoVO;
    }

}
