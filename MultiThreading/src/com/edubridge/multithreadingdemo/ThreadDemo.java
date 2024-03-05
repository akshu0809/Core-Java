package com.edubridge.multithreadingdemo;

public class ThreadDemo extends Thread{
	
	public void run()
	{
		//
		System.out.println("Thread is in the running state:"+" "+Thread.currentThread());
	}

	public static void main(String[] args) {
		//ThreadDemo t1=new ThreadDemo();
		//ThreadDemo t2=new ThreadDemo();
		for(int i=1;i<4;i++)
		{
			//System.out.println(t1.getName()+" "+t2.getName());
			ThreadDemo t1=new ThreadDemo();
			ThreadDemo t2=new ThreadDemo();
			t1.start();
			t2.start();
		}
		
		//when we call start() method, automatically it calls to the run() method.
		//t1.start();
		//t2.start();
		
	}

}
