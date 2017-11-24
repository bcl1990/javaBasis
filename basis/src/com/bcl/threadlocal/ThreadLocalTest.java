package com.bcl.threadlocal;

public class ThreadLocalTest {
	ThreadLocal<String> thLocal =new ThreadLocal<String>() {
		protected String initialValue() {
			return new String("123");
		};
	};
	public void set() {
		thLocal.set("aa");
	}
	public String get() {
		return thLocal.get();
	}
} 
