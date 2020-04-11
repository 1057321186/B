package com.projet.io;

import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 字符流读取文件 {

	// 站在程序的角度理解输入输出
	// InputStreamReader:字符输入流
	// OutputStreamReader:字符输出流
	// 通过流可以将数据读取到jvm（内存）中
	static String filePath = "E:/java学习/Test/Test1.txt";

	public static void main(String[] args) {
			//charReader();
			charWriter();
	}

	/*
	 * 字符流读取文件内容
	 * 
	 * InputStream 对应 FileInputStream
	 * FileReader
	 */
	static void charReader() {
		File file = new File(filePath);
		try {
			FileReader fileReader = new FileReader(file);
			// 创建字符数组!!不是字节
			char[] bs = new char[(int) file.length()];
			fileReader.read(bs);
			fileReader.close();
			for (char ch : bs) {
				System.out.print(ch);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	/*
	 * 字符流写文件内容
	 * 
	 * InputStream 对应 FileInputStream
	 * FileWriter
	 */

	static void charWriter() {
		File file = new File(filePath);
		try {
			FileWriter fileWriter = new FileWriter(file, true);
			String string = "5.这是要新增的";
			fileWriter.write(string.toCharArray(), 0, string.toCharArray().length);
			System.out.println("添加成功");
			fileWriter.flush();//必须flush
			fileWriter.close();
		} catch (Exception e) {
			System.out.println("添加失败");
			e.printStackTrace();
		}

	}

}
