package com.bcl.test;

public class Teacher {
	{
		System.out.println("111");
	}
	public Teacher() {
		System.out.println("222");
	}
	{
		System.out.println("333");
	}
	public static void main(String[] args) {
		Teacher t =new Teacher();
	}
	{
		System.out.println("444");
	}
	static{
		System.out.println("555");
	}
}
