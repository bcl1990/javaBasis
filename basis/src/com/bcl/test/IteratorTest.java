package com.bcl.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest<T> implements Iterable<T>{
	 private T str;  
	  
	    public T getStr() {  
	        return str;  
	    }  
	  
	    public void setStr(T str) {  
	        this.str = str;  
	    }  
	@Override
	public Iterator<T> iterator() {
		
		return new Iterator<T>() {
			int index=5;
			@Override
			public boolean hasNext() {
				if(index>0) {
					return true;
				}else {
					return false;
				}
				
			}

			@Override
			public T next() {
				index--;
				return (T)("AAA");
			}
		};
	}
	public static void main(String[] args) {
		IteratorTest<String> it= new IteratorTest();
		it.setStr("asdfg");
		it.iterator();
		for(String t:it) {
			System.out.println(t);
		}
		List<String> strList=new ArrayList<>();
		Iterator it2=strList.iterator();
		Iterator it3=strList.iterator();
		System.out.println(it2==it3);
		f(strList,it2);
	}
	static void f(List strList,Iterator it2){
		System.out.println("--------------");
		System.out.println(strList.iterator()==it2);
	}
}
