package com.example.Mapper;

import com.example.Entity.Countries;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IndexMapper {

    List<Countries> selectAll();
}
