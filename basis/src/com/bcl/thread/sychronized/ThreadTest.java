package com.bcl.thread.sychronized;

public class ThreadTest implements Runnable{
	private A1_Test t;
	 public ThreadTest(A1_Test t) {
		this.t=t;
	}
	@Override
	public void run() {
		synchronized(ThreadTest.class) {
			for(int k=0;k<1000000;k++) {
				t.getNext();
			}
		}
		
	}
}
