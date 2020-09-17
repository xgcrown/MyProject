package com.example.controller;

import com.example.Entity.Countries;
import com.example.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
public class IndexController {

    @Autowired
    IndexService indexService;

    @GetMapping("/selectById")
    @ResponseBody
    public Countries selectById(@RequestParam(value = "countryId") String id) {
        return indexService.selectById(id);
    }

    @PostMapping("/getAll")
    @ResponseBody
    public List<Countries> getAll() {
        return indexService.getAll();
    }
}