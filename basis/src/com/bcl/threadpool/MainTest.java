package com.bcl.threadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainTest {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println(Thread.activeCount());
		ExecutorService exec =Executors.newFixedThreadPool(10);
		/*Future<String> s=exec.submit(new Thread1());
		System.out.println(s.get());*/
		for(int i=0;i<5;i++) {
			exec.execute(new Thread2());
		}
		//exec.execute(new Thread2());
		Thread tt=new Thread(new Thread2());
		tt.start();
		Thread.sleep(100);
		System.out.println(Thread.activeCount());
		exec.shutdown();
		Thread.sleep(100);
		System.out.println(Thread.activeCount());
	}
}
