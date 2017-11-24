package com.bcl.thread.volatil;

import java.util.HashMap;
import java.util.Map;

public class Test {
	private static int i = 10;
	public static void main(String[] args) throws InterruptedException {
		Map map=new HashMap();
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName());
				synchronized (Test.class) {
					i--;
				}
			}
		};
		for(int i=0;i<10;i++) {
			Thread t =new Thread(r);
			t.start();
		}
		Runnable r2=new Runnable() {
			@Override
			public void run() {
				while(i>0) {
					Thread.yield();
				}
				System.out.println("结束了");
			}
		};
		Thread t2 =new Thread(r2);
		t2.start();
		
	}
}
