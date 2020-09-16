package com.example.service;

import com.example.Entity.Countries;
import com.example.Mapper.IndexMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexService {
    @Autowired
    IndexMapper indexMapper;

    public String getAll() {
        return null;
    }

    public List<Countries> selectAll() {
        return indexMapper.selectAll();
    }
}
