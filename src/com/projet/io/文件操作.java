package com.projet.io;

import java.io.File;
import java.io.IOException;



public class �ļ����� {
	public static void main(String[] args) throws IOException {
		//����·��
		File f1=new File("C:/Users/Administrator/Desktop/fle");
		if(!f1.exists()) {
				//�����ļ���
				f1.mkdir();
				//�����ļ�
				//f1.createNewFile();
		}
		System.out.println("f1�ľ���·��:"+f1.getAbsolutePath());
		//���·��,����ڹ���Ŀ¼,�����eclipse�У�������ĿĿ¼
		File f2=new File("lol.exe");
		System.out.println("f2�ľ���·�� :"+f2.getAbsolutePath());
		
		//��f1��Ϊ��Ŀ¼�����ļ����� 
		File f3 =new File(f1,"lol.exe");
		if(!f3.exists()) {
			f3.createNewFile();
		}
		System.out.println("f3�ľ���·��"+f3.getAbsolutePath());
	
		String[] f1Strings=f1.list();
		for (int i = 0; i < f1Strings.length; i++) {
			System.out.println(f1Strings[i]);
		}
		
		//����javaѧϰ�ļ��� 
		File f4File=new File("E:/javaѧϰ");
		/*
		 * String [] fStrings=f4File.list(); for(String string:fStrings) {
		 * System.out.println(string); }
		 */
		bianliFile("E:/javaѧϰ");
		
	}
	
	//����һ���ļ��������е��ļ����������ļ�����
	static void bianliFile(String fileName) {
		File file=new File(fileName);
		//��ȡ��ǰ�ļ�����ľ���·��
		String string=file.getAbsolutePath();
		//��ȡ��ǰ�ļ������е��ļ����ַ������飨���������ļ���
		String []strings=file.list();
		//��������
		for(int i=0;i<strings.length;i++) {
			System.out.println(strings[i]);
			//�жϵ�ǰ�ļ��Ƿ�Ϊ�ļ���
			if(new File(string+"/"+strings[i]).isDirectory()) {
				//����ǣ��ٵ��ñ������� 
				bianliFile(string+"/"+strings[i]);	
			}
		}
		
		
	}
}
