package com.project.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
public static void main(String[] args) {
		
		try {
			//2、记载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//3、建立数据库连接
			System.out.println("kaishi");
			Connection c = DriverManager.getConnection(
                            "jdbc:mysql://47.100.245.66:3306/tmall?characterEncoding=UTF-8",
                            "root", "admin");
			
			System.out.println("数据库驱动加载成功，获取连接对象"+c);
			
			//创建statement			注：使用的是 java.sql.Statement
			Statement s = c.createStatement();
			
			boolean a=s.execute("select count(*) from user");
			System.out.println(a);
		} catch (Exception e) {
			System.out.println("连接失败");
		}
	}
}
