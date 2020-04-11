package com.projet.io;

import java.io.File;
import java.io.IOException;



public class 文件操作 {
	public static void main(String[] args) throws IOException {
		//绝对路径
		File f1=new File("C:/Users/Administrator/Desktop/fle");
		if(!f1.exists()) {
				//创建文件夹
				f1.mkdir();
				//创建文件
				//f1.createNewFile();
		}
		System.out.println("f1的绝对路径:"+f1.getAbsolutePath());
		//相对路径,相对于工作目录,如果在eclipse中，就是项目目录
		File f2=new File("lol.exe");
		System.out.println("f2的绝对路径 :"+f2.getAbsolutePath());
		
		//把f1作为父目录创建文件对象 
		File f3 =new File(f1,"lol.exe");
		if(!f3.exists()) {
			f3.createNewFile();
		}
		System.out.println("f3的绝对路径"+f3.getAbsolutePath());
	
		String[] f1Strings=f1.list();
		for (int i = 0; i < f1Strings.length; i++) {
			System.out.println(f1Strings[i]);
		}
		
		//便利java学习文件夹 
		File f4File=new File("E:/java学习");
		/*
		 * String [] fStrings=f4File.list(); for(String string:fStrings) {
		 * System.out.println(string); }
		 */
		bianliFile("E:/java学习");
		
	}
	
	//遍历一个文件夹内所有的文件，包括子文件名称
	static void bianliFile(String fileName) {
		File file=new File(fileName);
		//获取当前文件对象的绝对路径
		String string=file.getAbsolutePath();
		//获取当前文件下所有的文件名字符串数组（不包含子文件）
		String []strings=file.list();
		//遍历名称
		for(int i=0;i<strings.length;i++) {
			System.out.println(strings[i]);
			//判断当前文件是否为文件夹
			if(new File(string+"/"+strings[i]).isDirectory()) {
				//如果是，再调用遍历函数 
				bianliFile(string+"/"+strings[i]);	
			}
		}
		
		
	}
}
