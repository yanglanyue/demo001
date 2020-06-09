package com.example.demo001.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody//返回内容到浏览器（如果是对象，转为json数据）
@RestController//用以替换@Controller和@ResponseBody
public class controller1 {

    @RequestMapping("/go1")//负责接收
    public String begin1(){
        return "hello spring boot";
    }

    @RequestMapping("/go2")
    public String begin2(){
        return "你好";
    }

    @Value("${person.name}")
    private String name;
    @RequestMapping("/go3")
    public String begin3(){
        return "你好"+name;
    }
}
