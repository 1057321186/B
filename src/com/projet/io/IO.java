package com.projet.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class IO {
	public static void main(String[] args) {
			//�ļ�����.bianliFile("E:/javaѧϰ");
			�ļ�����.bianliFile("C:\\Users\\Administrator\\Desktop\\fle");
			
	}
	
	//�ֽ�����ȡ�ļ�:InputStream
	void byteRead() {
		//ָ���ļ�����ʵ����һ��File�������ں�������
		String path="C:\\Users\\Administrator\\Desktop\\Text.txt";
		File file=new File(path);
		try {
			//����������
			InputStream inputStream=new FileInputStream(file);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
