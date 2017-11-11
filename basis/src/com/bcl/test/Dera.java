package com.bcl.test;

public class Dera implements Mobile{
	Mobile mobile=new Nokia() ;
	@Override
	public void call() {
		System.out.println("shipin");
		mobile.call();
	}

}
