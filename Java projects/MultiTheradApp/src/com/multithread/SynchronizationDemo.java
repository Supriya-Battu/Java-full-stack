package com.multithread;

public class SynchronizationDemo extends Thread{
	//method level synchronization
	//public synchronized void run()
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("i value: "+i);
			//block level synchronization
			synchronized(this) //object level lock
			{
			System.out.println("Hi");
			}
		}
	}
	public static void main(String[] args) {
		SynchronizationDemo sd = new SynchronizationDemo();
		SynchronizationDemo sd1 = new SynchronizationDemo();
		sd.start();
		sd1.start();
	}
	
}
