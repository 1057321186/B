package com.projet.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class �ֽ�����ȡ�ļ� {

	// վ�ڳ���ĽǶ�����������
	// InputStream:������
	// OutputStream:�����
	// ͨ�������Խ����ݶ�ȡ��jvm���ڴ棩��

	public static void main(String[] args) {
		// ��ȡ�ļ�����
		byteRead();
		System.out.println("-------------");
		// д������
		charWrite();
		System.out.println("-------------");
		byteRead();
		
	

	}

	/*
	 * �ֽ�����ȡ�ļ�����
	 * 
	 * InputStream ��Ӧ FileInputStream
	 * 
	 */
	static void byteRead() {
		// 1ʵ�����ļ�����
		File file = new File("E:/javaѧϰ/Test/Test.txt");

		// 2��File�����ݶ�ȡ���ļ��������У������ֽ���������ָ��ö����ʵ��
		InputStream inputStream;
		try {
			inputStream = new FileInputStream(file);
			// 3����һ����length������������ļ����ֽڴ�Сһ����Byte����
			byte[] bytes = new byte[(int) file.length()];

			// 4��ȡ�ļ��е����ݵ��ַ�������
			inputStream.read(bytes);
			// �ر���
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
	 * �ֽ���д���ļ�����
	 * 
	 * OutputStream ��Ӧ FileOutputStream
	 * 
	 */
	static void charWrite() {

		File file = new File("E:/javaѧϰ/Test/Test.txt");
		try {
			OutputStream outputStream = new FileOutputStream(file,true);//��true��ʾ���ļ���׷������
			String string = "1111111111111111";
			outputStream.write(string.getBytes(), 0, string.getBytes().length);
			outputStream.close();
			System.out.println("�ļ�д��ɹ�");
		} catch (Exception e) {
			System.out.println("�ļ�д��ʧ��");
			e.printStackTrace();
		}
	}

}
