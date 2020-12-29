package com.example.util;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test1 {

	@Test
	void contextLoads() {
		System.out.println("hello springboot");
	}
	@Test
	void oracle() throws SQLException {
		try {
			Class.forName("org.apache.hive.jdbc.HiveDriver");
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
		Connection con = DriverManager.getConnection("jdbc:hive2://10.4.7.162:10000", "hive", "hive123");//后两个参数是用户名密码
		if(con==null)
			System.out.println("连接失败");
		else {
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM ods_cghz limit 10";
			System.out.println("Running: " + sql);
			ResultSet res = stmt.executeQuery(sql);
			int a=0;
			while (res.next()) {
				System.out.println(res.getString(1));
			}
		}

	}

}
