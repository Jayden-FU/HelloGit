/*
@ClassName ConfigException
@Description TODO
@Author SubUp
@Date   2022/4/4
@Version 1.0
*/

package com.example.webboot04.config;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.IOException;

@ControllerAdvice
public class ConfigException {
    @ExceptionHandler(value = {IOException.class,ArithmeticException.class})
    public String doExp(Model model,Exception e){
        model.addAttribute("msg",e.getMessage());
        return "error";
    }
}
