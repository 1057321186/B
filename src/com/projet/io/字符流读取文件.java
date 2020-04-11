package com.projet.io;

import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class �ַ�����ȡ�ļ� {

	// վ�ڳ���ĽǶ�����������
	// InputStreamReader:�ַ�������
	// OutputStreamReader:�ַ������
	// ͨ�������Խ����ݶ�ȡ��jvm���ڴ棩��
	static String filePath = "E:/javaѧϰ/Test/Test1.txt";

	public static void main(String[] args) {
			//charReader();
			charWriter();
	}

	/*
	 * �ַ�����ȡ�ļ�����
	 * 
	 * InputStream ��Ӧ FileInputStream
	 * FileReader
	 */
	static void charReader() {
		File file = new File(filePath);
		try {
			FileReader fileReader = new FileReader(file);
			// �����ַ�����!!�����ֽ�
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
	 * �ַ���д�ļ�����
	 * 
	 * InputStream ��Ӧ FileInputStream
	 * FileWriter
	 */

	static void charWriter() {
		File file = new File(filePath);
		try {
			FileWriter fileWriter = new FileWriter(file, true);
			String string = "5.����Ҫ������";
			fileWriter.write(string.toCharArray(), 0, string.toCharArray().length);
			System.out.println("��ӳɹ�");
			fileWriter.flush();//����flush
			fileWriter.close();
		} catch (Exception e) {
			System.out.println("���ʧ��");
			e.printStackTrace();
		}

	}

}
