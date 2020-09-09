package com.example.service.impl;

import com.example.Mapper.IndexMapper;
import com.example.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    IndexMapper indexMapper;

    @Override
    public String getAll() {
        return null;
    }
}
