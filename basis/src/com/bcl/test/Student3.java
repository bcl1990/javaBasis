package com.bcl.test;

public class Student3 {
	public static void main(String[] args) {
		System.out.println(B.a);
		
	}
}
class B{
	static{
		System.out.println("222");
	}
	 static  int a=2;
	 static final int b=f();
	static int f(){
		System.out.println("111");
		return 1;
	}
}
