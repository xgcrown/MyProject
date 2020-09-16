package com.example.controller;

import com.example.Entity.Countries;
import com.example.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api")
public class IndexController {

    @Autowired
    IndexService indexService;

    @PostMapping("/index")
    @ResponseBody
    public List<Countries> index() {
        return indexService.selectAll();
    }
}