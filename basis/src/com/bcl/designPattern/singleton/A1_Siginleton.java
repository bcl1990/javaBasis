package com.bcl.designPattern.singleton;
/**
 * 
 * @author bcl
 *	懒汉模式 线程不安全
 */
public class A1_Siginleton {
	private static A1_Siginleton siginleton;
	private A1_Siginleton() {
		
	}
	public static A1_Siginleton getInstance() {
		if(siginleton==null) {
			siginleton=new A1_Siginleton();	
		}
		return siginleton;
	}
}
