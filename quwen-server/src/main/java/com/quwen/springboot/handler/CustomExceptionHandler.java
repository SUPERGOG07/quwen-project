package com.quwen.springboot.handler;

import com.quwen.springboot.common.ErrorEnum;
import com.quwen.springboot.common.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class CustomExceptionHandler {

    public static final Logger logger = LoggerFactory.getLogger(CustomExceptionHandler.class);

    @ExceptionHandler
    public Result exceptionHandler(HttpServletRequest req, Exception e) {
        logger.error("出现异常!异常如下:", e);
        Result result = new Result();
        return result.error(ErrorEnum.UNKNOWN_ERROR);
    }
}
