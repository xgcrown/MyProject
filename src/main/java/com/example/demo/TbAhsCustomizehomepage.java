package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;
import java.io.InputStream;

/**
 * @Description  
 * @Author  Hunter
 * @Date 2020-07-30 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="TB_AHS_CUSTOMIZEHOMEPAGE" )
public class TbAhsCustomizehomepage implements Serializable {

	private static final long serialVersionUID =  6073010630563061814L;

   	@Column(name = "PK" )
	private String pk;

	/**
	 * 当前登录人
	 */
   	@Column(name = "USERID" )
	private String userid;

	/**
	 * 名称
	 */
   	@Column(name = "NAME" )
	private String name;

	/**
	 * 描述
	 */
   	@Column(name = "DESCRIBE" )
	private String describe;

	/**
	 * 是否默认
	 */
   	@Column(name = "ISDEFAULT" )
	private String isdefault;

   	@Column(name = "CREATETIME" )
	private Date createtime;

   	@Column(name = "LASTMODIFYTIME" )
	private Date lastmodifytime;

   	@Column(name = "DELETEFLAG" )
	private String deleteflag;

	/**
	 * 主页对应的模板
	 */
   	@Column(name = "TEMPLATE" )
	private InputStream template;

}
