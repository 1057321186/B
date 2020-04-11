package com.projet.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class 字节流读取文件 {

	// 站在程序的角度理解输入输出
	// InputStream:输入流
	// OutputStream:输出流
	// 通过流可以将数据读取到jvm（内存）中

	public static void main(String[] args) {
		// 读取文件内容
		byteRead();
		System.out.println("-------------");
		// 写入内容
		charWrite();
		System.out.println("-------------");
		byteRead();
		
	

	}

	/*
	 * 字节流读取文件内容
	 * 
	 * InputStream 对应 FileInputStream
	 * 
	 */
	static void byteRead() {
		// 1实例化文件对象
		File file = new File("E:/java学习/Test/Test.txt");

		// 2将File的数据读取到文件输入流中，并将字节流的引用指向该对象的实例
		InputStream inputStream;
		try {
			inputStream = new FileInputStream(file);
			// 3创建一个和length方法返回这个文件的字节大小一样的Byte数组
			byte[] bytes = new byte[(int) file.length()];

			// 4读取文件中的内容到字符数组中
			inputStream.read(bytes);
			// 关闭流
			inputStream.close();
			for (byte b : bytes) {
				System.out.print(b);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * 字节流写入文件内容
	 * 
	 * OutputStream 对应 FileOutputStream
	 * 
	 */
	static void charWrite() {

		File file = new File("E:/java学习/Test/Test.txt");
		try {
			OutputStream outputStream = new FileOutputStream(file,true);//加true表示在文件后追加内容
			String string = "1111111111111111";
			outputStream.write(string.getBytes(), 0, string.getBytes().length);
			outputStream.close();
			System.out.println("文件写入成功");
		} catch (Exception e) {
			System.out.println("文件写入失败");
			e.printStackTrace();
		}
	}

}
