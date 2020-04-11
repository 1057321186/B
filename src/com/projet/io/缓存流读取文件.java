package com.projet.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class 缓存流读取文件 {

	// 站在程序的角度理解输入输出
	// 缓存流需要建立在字节流或字符流的基础上
	// 通过流可以将数据读取到jvm（内存）中
	static String filepath = "E:/java学习/Test/Test2.txt";

	public static void main(String[] args) {

		//bufferRead();
		bufferWrite();
		
		
		File file=new File("E:\\java学习\\Test\\test1.txt");
		try {
			FileReader fileReader=new FileReader(file);
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			String line;
			while((line=bufferedReader.readLine())!=null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * 缓存流读取文件内容
	 * 
	 * bufferReader
	 * 
	 */
	static void bufferRead() {

		File file = new File(filepath);
		try {
			// 创建文件字符流
			FileReader fileReader = new FileReader(file);
			// 缓存流必须建立在一个存在的流的基础上
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while (true) {
				String line = bufferedReader.readLine();
				if (null == line)
					break;
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * 缓存流写入文件内容
	 * 
	 * printWriter
	 * 
	 */
	static void bufferWrite() {
		File file=new File(filepath);
		
		try {
			//必须创建文件字符流 /加true可继续在后新增
			FileWriter fileWriter=new FileWriter(file,true);
			//缓冲流必须建立在一个存在的流的基础上
			PrintWriter printWriter=new PrintWriter(fileWriter);
		printWriter.println("新增第一句");
		printWriter.print("新增第2句");
		printWriter.flush();
		printWriter.close();
		fileWriter.close();
		System.out.println("写入成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
