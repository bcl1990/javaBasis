package com.bcl.thread.sychronized;

public class ThreadTest2 implements Runnable{
	private A1_Test t;
	 public ThreadTest2(A1_Test t) {
		this.t=t;
	}
	@Override
	public void run() {
		for(int k=0;k<1000000;k++) {
			t.getPrev();
		}
	}
}
