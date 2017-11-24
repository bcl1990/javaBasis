package com.bcl.collection;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T>{
	private Node last;
	private Node first;
	private int size=0;
	public void add(T t) {
		if(size==0) {
			last=new Node<>();
			last.setT(t);
			first=last;
			size++;
		}else{
			Node<T> node =new Node();
				node.setT(t);
			last.setNext(node);
			last=node;
			size++;
		}
	}
	public int size() {
		return this.size;
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<T>() {
			Node curr=first;
			int cours=size;
			@Override
			public boolean hasNext() {
				if(cours==0) {
					return false;
				}else {
					cours--;
					return true;
				}
			}

			@Override
			public T next() {
				Node node=curr;
				if(curr.getNext()!=null) {
					curr=curr.getNext();
				}
				return (T) node.getT();
			}
		};
	}
}
