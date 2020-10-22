package com.example.Entity;

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
	private Long regionId;
	private String countryId;
	private String countryName;
}
