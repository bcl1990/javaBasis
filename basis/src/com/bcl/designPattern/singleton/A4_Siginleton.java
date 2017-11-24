package com.bcl.designPattern.singleton;

/**
 * 
 * @author bcl
 * 双锁检验，只有第一次instance==null的时候加锁。
 * 但是instance = new A4_Siginleton()时，对象没有初始化成功时，判断instance！=null，就返回
 * 了instance。
 * http://blog.csdn.net/anjxue/article/details/51038466  双锁检验的问题
 */
public class A4_Siginleton {
	private static  A4_Siginleton  instance;

	private A4_Siginleton() {
	}

	public static synchronized A4_Siginleton getInstance() {
		if (instance == null) {
			synchronized (A4_Siginleton.class) {
				if (instance == null) {
					instance = new A4_Siginleton();
				}
			}
		}
		return instance;
	}
}
