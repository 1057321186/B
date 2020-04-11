package com.project.thread;

import java.util.concurrent.CountDownLatch;

public class CountDownLathDemo {
	public static void main(String[] args) throws InterruptedException {
		new CountDownLathDemo().go();
	}

	private void go() throws InterruptedException {
		CountDownLatch countDownLatch = new CountDownLatch(3);
		// ���δ��������̲߳�����
		new Thread(new Task(countDownLatch), "Thread1").start();
		Thread.sleep(1000);
		new Thread(new Task(countDownLatch), "Thread2").start();
		Thread.sleep(1000);
		new Thread(new Task(countDownLatch), "Thread3").start();
		Thread.sleep(1000);
		countDownLatch.await();
		System.out.println("�����߳��ѵĵ�����߳̿�ʼִ��"+System.currentTimeMillis());
	}

	class Task implements Runnable {
		private CountDownLatch countDownLatch;

		public Task(CountDownLatch countDownLatch) {
			this.countDownLatch = countDownLatch;
		}

		@Override
		public void run() {
			System.out.println("�߳�" + Thread.currentThread().getName());
			 countDownLatch.countDown();
		}

	}

}
