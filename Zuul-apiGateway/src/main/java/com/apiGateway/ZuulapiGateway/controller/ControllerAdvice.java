package com.apiGateway.ZuulapiGateway.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(Exception.class)
    public String handleException(HttpServletRequest request, Exception ex){
        System.out.println("Exception caused url:"+request.getRequestURI()+", Exception trace :"+ex.getMessage());
        return ex.getCause().toString();

    }
}
