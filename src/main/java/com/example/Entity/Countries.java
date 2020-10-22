package com.example.Entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description  
 * @Author  HG
 * @Date 2020-09-16 
 */

@Data
@TableName( value ="countries" )
public class Countries  implements Serializable {

	private static final long serialVersionUID =  6272380669670240504L;
	@TableField(value = "region_id" )
	private Long regionId;

   	@TableField(value = "country_id" )
	private String countryId;

   	@TableField(value = "country_name" )
	private String countryName;



}
