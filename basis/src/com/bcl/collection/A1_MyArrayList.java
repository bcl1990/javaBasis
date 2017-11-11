package com.bcl.collection;

import java.util.Iterator;
/**
 * 
 * @author bcl
 * 集合为什么要实现Iterable()，而不是实现iterator()，因为实现iterator()只能有一个迭代位置，
 * 而Iterable()每次迭代都可以从开始迭代
 * 
 */
public class A1_MyArrayList<T> implements Iterable<T> {
	private Object[] arr=new Object[10];
	private int size=0;
	private int course=0;
	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return course!=size;
			}

			@Override
			public T next() {
				course++;
				return (T)arr[course-1];
			}
		};
	}
	public void add(T t) {
		arr[size++]=t;
	}
	public int size() {
		return size;
	}
}
