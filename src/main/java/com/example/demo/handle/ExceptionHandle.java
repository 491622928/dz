package com.example.demo.handle;

import com.example.demo.model.Result;
import com.example.demo.util.ExceptionUtil;
import com.example.demo.util.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof ExceptionUtil){
            ExceptionUtil exceptionUtil=(ExceptionUtil) e;
            return ResultUtil.error(exceptionUtil.getCode(),exceptionUtil.getMessage());
        }else{
            return ResultUtil.error(500,"未知错误");
        }
    }
}
