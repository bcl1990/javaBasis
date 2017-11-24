package com.bcl.thread.sychronized;
/**
 * 
 * @author bcl
 *	static方法的锁对象时class对象
 */
public class A2_Test {
	public static void main(String[] args) {
		Thread t1=new Thread(new A2_Thread());
		Thread t2=new Thread(new A2_Thread());
		t1.start();
		t2.start();
		while(Thread.activeCount()>1) {
			Thread.yield();
		}
		System.out.println(A2_Thread.i);
	}
}
