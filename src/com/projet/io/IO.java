package com.projet.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class IO {
	public static void main(String[] args) {
			//文件操作.bianliFile("E:/java学习");
			文件操作.bianliFile("C:\\Users\\Administrator\\Desktop\\fle");
			
	}
	
	//字节流读取文件:InputStream
	void byteRead() {
		//指定文件名来实例化一个File对象，用于后续操作
		String path="C:\\Users\\Administrator\\Desktop\\Text.txt";
		File file=new File(path);
		try {
			//创建输入流
			InputStream inputStream=new FileInputStream(file);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
