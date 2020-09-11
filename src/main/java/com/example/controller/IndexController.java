package com.example.controller;

import com.example.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class IndexController {

    @Autowired
    IndexService indexService;

    @GetMapping("/index")
    @ResponseBody
    public String index() {
        return "helloword!";
    }
}