package com.example.service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.Entity.Countries;
import com.example.Entity.User;
import com.example.Mapper.CountriesMapper;
import com.example.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IndexService {

    @Autowired
    CountriesMapper countriesMapper;
    @Autowired
    UserMapper userMapper;

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

    @Transactional
    public boolean addUser(User user) {
        userMapper.insert(user);
        int i = 1/0;
        return true;
    }
}
