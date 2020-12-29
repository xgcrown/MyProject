package com.example.util;

import java.sql.*;

public class Hive {
    private static String driverName = "org.apache.hive.jdbc.HiveDriver";
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName(driverName);
        }catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.exit(1);
        }
        Connection con = DriverManager.getConnection("jdbc:hive2://10.4.7.162:10000/ods", "hive", "hive123");//后两个参数是用户名密码
        if(con==null)
            System.out.println("连接失败");
        else {
            Statement stmt = con.createStatement();
            //String sql = "show tables";
            String sql = "select count(0) from ods_aqkc";

            System.out.println("Running: " + sql);
            ResultSet res = stmt.executeQuery(sql);
            int a=0;
            while (res.next()) {
                System.out.println("------"+res.getString(1));
            }
        }
    }
}
