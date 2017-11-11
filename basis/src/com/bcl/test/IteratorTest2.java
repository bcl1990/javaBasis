package com.bcl.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest2<T> implements Iterator<T>{
	int index=10;
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		index--;
		return null;
	}
	public static void main(String[] args) {
		IteratorTest2 it=new IteratorTest2<>();
		for(int i=0;i<3;i++) {
			it.next();
		}
		System.out.println(it.index);
		f(it);
	}
	
	static void f(IteratorTest2 it) {
		System.out.println(it.index);
	}
}
