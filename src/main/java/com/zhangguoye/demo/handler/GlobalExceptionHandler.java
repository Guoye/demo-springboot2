package com.zhangguoye.demo.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 全局异常捕获
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * Handler接收2个参数  httpReq 和 e
     * @param req HttpServletRequest
     * @param e Exception
     * @return 全局通用的map
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    private Map<String, Object> exceptionHandler(HttpServletRequest req, Exception e){
        Map<String, Object> modalMap = new HashMap<>();
        modalMap.put("code", 500);
        modalMap.put("message", e.getMessage());
        return modalMap;
    }
}
