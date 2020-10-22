package com.example.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.Entity.Countries;
import com.example.Mapper.CountriesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexService {

    @Autowired
    CountriesMapper countriesMapper;

    public Countries selectById(String id) {
        QueryWrapper<Countries> wrapper = new QueryWrapper();
        wrapper.eq("country_id",id);
        return countriesMapper.selectOne(wrapper);

    }

    public List<Countries> getAll() {
        QueryWrapper<Countries> wrapper = new QueryWrapper();
        return countriesMapper.selectList(wrapper);
    }
    public Countries query() {
        return countriesMapper.query();
    }
}
