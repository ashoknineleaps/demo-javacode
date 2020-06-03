
package com.program;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenOddNumberTwoThread {

	private static int num = 1;
	private final static Object lock = new Object();

	public static void main(String[] args) {

		Runnable even = () -> {

			while (num < 10) {
				synchronized (lock) {

					while (num % 2 == 0) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println(num);
					num++;
					lock.notify();
				}

			}
		};

		Runnable odd = () -> {

			while (num <= 10) {
				synchronized (lock) {

					while (num % 2 != 0) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println(num);
					num++;
					lock.notify();
				}

			}
		};

		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(even);
		service.execute(odd);

		service.shutdown();
		
//		Thread evenThread = new Thread(even);
//		Thread oddThread = new Thread(odd);
//		
//		evenThread.start();
//		oddThread.start();
	}
}
