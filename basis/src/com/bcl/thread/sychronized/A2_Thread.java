package com.bcl.thread.sychronized;

public class A2_Thread implements Runnable{
	public static int i=0;
	@Override
	public void run() {
		for(int i=0;i<1000000;i++) {
			
			jia();
			jian();
		}
	}
	public  void jia() {
		synchronized(A2_Thread.class) {
			i++;
		}
		
	}
	static synchronized void jian() {
		i--;
	}
}
