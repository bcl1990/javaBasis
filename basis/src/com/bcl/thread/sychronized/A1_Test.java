package com.bcl.thread.sychronized;
/**
 * 
 * @author bcl
 * synchronized锁住的是括号内的对象，两块不同的代码如果用同一个锁对象两个线程也不能同时进入。
 * 
 */
public class A1_Test{
	public int i=0;
	public static void main(String[] args) {
		A1_Test t=new A1_Test();
		ThreadTest tt=new ThreadTest(t);
		ThreadTest tt3=new ThreadTest(t);
		ThreadTest2 tt2=new ThreadTest2(t);
		long time1=System.currentTimeMillis();
		Thread t1=new Thread(tt);
		Thread t2=new Thread(tt3);//tt和tt2两个对象，如果synchronized()里用this就是两个锁对象，就不能保证线程安全
		//Thread t3=new Thread(tt2);
		//Thread t4=new Thread(tt2);
		t1.start();
		t2.start();
		//t3.start();
		//t4.start();
		while(Thread.activeCount()>1) {
			Thread.yield();
		}
		long time2=System.currentTimeMillis();
		System.out.println(t.i);
		System.out.println(time2-time1);
	}
		void  getNext() {
		
		i++;
	}
		void  getPrev() {
			i--;
		}
}
