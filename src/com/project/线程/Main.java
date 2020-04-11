package com.project.线程;

import java.util.Date;

public class Main extends  Thread {
	public void run() {
		int i=0;
		while(i<10) {
		System.out.println(i+"这是个线程");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		i++;
		}		
	}
	public static void main(String[] args) {
		
		Thread t1Thread=new Thread() {
			@Override
			public void run() {
				System.out.println("执行t1");
			}
		};
		t1Thread.start();
	for(int i=0;i<10;i++) {
		if(i==6) {
			try {
				t1Thread.join();System.out.println("执行");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("失败");
				e.printStackTrace();
			}
		}
		System.out.println(System.currentTimeMillis());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
}
