package com.project.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
public static void main(String[] args) {
		
		try {
			//2����������
			Class.forName("com.mysql.jdbc.Driver");
			//3���������ݿ�����
			System.out.println("kaishi");
			Connection c = DriverManager.getConnection(
                            "jdbc:mysql://47.100.245.66:3306/tmall?characterEncoding=UTF-8",
                            "root", "admin");
			
			System.out.println("���ݿ��������سɹ�����ȡ���Ӷ���"+c);
			
			//����statement			ע��ʹ�õ��� java.sql.Statement
			Statement s = c.createStatement();
			
			boolean a=s.execute("select count(*) from user");
			System.out.println(a);
		} catch (Exception e) {
			System.out.println("����ʧ��");
		}
	}
}
