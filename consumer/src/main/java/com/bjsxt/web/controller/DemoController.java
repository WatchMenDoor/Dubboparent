package com.bjsxt.web.controller;

import com.bjsxt.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("/get")
    public String getMsg(String str) {
        System.out.println("=========================");
        return this.demoService.showInfo(str);
    }
}