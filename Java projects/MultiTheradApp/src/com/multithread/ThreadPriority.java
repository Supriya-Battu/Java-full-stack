package com.multithread;

public class ThreadPriority extends Thread{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Child Thread "+i);
		}
	}
	public static void main(String[] args) {
		ThreadPriority tp = new ThreadPriority();
		tp.setPriority(Thread.MAX_PRIORITY);
		tp.start();//range of thread 1-10 
		//System.out.println("Priority: "+tp.getPriority());
		//tp.setPriority(17); Illegal Argument Exception
		//tp.setPriority(7);
		//tp.setPriority(Thread.MIN_PRIORITY);
		//tp.setPriority(Thread.MAX_PRIORITY-2);
		//tp.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Priority: "+tp.getPriority());
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main "+i);
		}
		//To count active threads
		System.out.println("No.of.Threads: "+Thread.activeCount());
	}

}
