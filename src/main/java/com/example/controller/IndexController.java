package com.example.controller;

import com.example.Entity.Countries;
import com.example.Entity.User;
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

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "IndexService OK";
    }

    @GetMapping("/selectById")
    @ResponseBody
    public Countries selectById(@RequestParam("countryId") String id) {
        return indexService.selectById(id);
    }

    @PostMapping("/getAll")
    @ResponseBody
    public List<Countries> getAll() {
        return indexService.getAll();
    }

    @PostMapping("/addUser")
    @ResponseBody
    public boolean addUser(@RequestBody User user) {
        return indexService.addUser(user);
    }

    /**
     * 手动xml
     * @return
     */
    @PostMapping("/query")
    @ResponseBody
    public Countries query() {
        return indexService.query();
    }
}