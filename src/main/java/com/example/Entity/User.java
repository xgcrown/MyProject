package com.example.Entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description  
 * @Author  HG
 * @Date 2021-01-07 
 */

@Data
@TableName( value ="user" )
public class User  implements Serializable {

	private static final long serialVersionUID =  8859732876046634207L;

   	@TableId(value = "id", type = IdType.INPUT )
	private Integer id;

   	@TableField(value = "age" )
	private Integer age;

   	@TableField(value = "name" )
	private String name;

   	@TableField(value = "createtime",fill = FieldFill.INSERT)
	@JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
	private Date createTime;

   	@TableField(value = "updatetime",fill = FieldFill.INSERT_UPDATE)
	@JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
	private Date updateTime;

}
