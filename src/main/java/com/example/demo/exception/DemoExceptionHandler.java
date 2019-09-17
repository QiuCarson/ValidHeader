package com.example.demo.exception;

import com.example.demo.enums.ResultEnum;
import com.example.demo.utils.ResultUtil;
import com.example.demo.vo.DemoVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class DemoExceptionHandler {
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public DemoVO handle(Exception e) {
        if(e instanceof DemoException){
            DemoException newErpException=(DemoException) e;
            return ResultUtil.error(newErpException.getCode(), newErpException.getMessage());
        }else{
            log.error("【异常错误】{}",e);
            return ResultUtil.error(ResultEnum.UNKNOWN_ERROR);
        }
 
    }
}