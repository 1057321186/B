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

public class ��������ȡ�ļ� {

	// վ�ڳ���ĽǶ�����������
	// ��������Ҫ�������ֽ������ַ����Ļ�����
	// ͨ�������Խ����ݶ�ȡ��jvm���ڴ棩��
	static String filepath = "E:/javaѧϰ/Test/Test2.txt";

	public static void main(String[] args) {

		//bufferRead();
		bufferWrite();
		
		
		File file=new File("E:\\javaѧϰ\\Test\\test1.txt");
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
	 * ��������ȡ�ļ�����
	 * 
	 * bufferReader
	 * 
	 */
	static void bufferRead() {

		File file = new File(filepath);
		try {
			// �����ļ��ַ���
			FileReader fileReader = new FileReader(file);
			// ���������뽨����һ�����ڵ����Ļ�����
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
	 * ������д���ļ�����
	 * 
	 * printWriter
	 * 
	 */
	static void bufferWrite() {
		File file=new File(filepath);
		
		try {
			//���봴���ļ��ַ��� /��true�ɼ����ں�����
			FileWriter fileWriter=new FileWriter(file,true);
			//���������뽨����һ�����ڵ����Ļ�����
			PrintWriter printWriter=new PrintWriter(fileWriter);
		printWriter.println("������һ��");
		printWriter.print("������2��");
		printWriter.flush();
		printWriter.close();
		fileWriter.close();
		System.out.println("д��ɹ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
