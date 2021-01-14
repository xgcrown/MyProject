package com.example.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 新增，更新时，自动更新字段
 */
@Component
@Slf4j
public class MyDetaObjectHander implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("come to insert fill .........");
        //setFieldValByName(String fieldName, Object fieldVal, MetaObject metaObject)
        this.setFieldValByName("createTime",new Date(),metaObject);
        this.setFieldValByName("updateTime",new Date(),metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("come to update fill .......");

        this.setFieldValByName("updateTime",new Date(),metaObject);

    }
}
