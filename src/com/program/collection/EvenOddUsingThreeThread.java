package com.program.collection;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenOddUsingThreeThread {

	private static int count = 1;
	private static final int MAX = 10;
	private static final Object LOCK = new Object();
	private int threadIdToRun = 1;
	
	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		EvenOddUsingThreeThread evenOddSeries = new EvenOddUsingThreeThread();
		
		Printer printerOne = evenOddSeries.new Printer(1, "ThreadName-1");
		Printer printerTwo = evenOddSeries.new Printer(2, "ThreadName-2");
		Printer printerThree = evenOddSeries.new Printer(3, "ThreadName-3");
		
		service.execute(printerOne);
		service.execute(printerTwo);
		service.execute(printerThree);
		
		service.shutdown();
	}
	
	class Printer implements Runnable
	{
		private int threadId;
		
		private String threadName;

		
		public Printer(int threadId, String threadName) {
			this.threadId = threadId;
			this.threadName = threadName;
		}


		@Override
		public void run() {
			
			try
			{
				while(count <= MAX)
				{
					synchronized (LOCK) {
					
						if(threadId != threadIdToRun)
						{
							LOCK.wait();
						}
						else
						{
							System.out.println(threadName + " : "+ count);
							count++;
							
							if(threadId == 1)
							{
								threadIdToRun = 2;
							}
							else if(threadId == 2)
							{
								threadIdToRun = 3;
							}
							else if(threadId == 3)
							{
								threadIdToRun = 1;
							}
							LOCK.notifyAll();
						}
					}
				}
				
				
			}
			catch (Exception e) {
			}
		}
		
	}
}
