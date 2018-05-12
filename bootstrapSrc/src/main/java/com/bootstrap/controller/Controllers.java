package com.bootstrap.controller;

import com.bootstrap.service.Services;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping
public class Controllers {

    @Resource
    private Services services;

    @GetMapping("/")
    public String index(){
        return "index";
    }

}
