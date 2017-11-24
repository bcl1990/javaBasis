package com.bcl.reference;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
/**
 * 
 * @author bcl
 *	byte[] b=new byte[1000*1000*100]注意数组也是分配在堆上，不是局部变量
 */
public class A1_SoftAndWeak {
	 public static void main(String[] args) {  
		 	/**
		 	 * 当内存快不够时回收SoftReference
		 	 */
	    	/*People p1=new People("zhouqian", 20);
	    	People p2=new People("11", 22);
	    	ReferenceQueue<People> rq= new ReferenceQueue<>();
	    	SoftReference<People> reference=new SoftReference<People>(p1,rq);
	        System.out.println(reference.get()); 
	        p1=null;
	        //p2=null;//先回收p2如果内存够了就不回收p1，如果内存还不够第二次gc时回收p1，如果内存还不够就内存溢出
	        byte[] b=new byte[1000*1000*100];//设置b大小
	        System.gc();//通知JVM回收资源  
	        System.out.println(reference.get());
	        System.out.println(reference.isEnqueued());*/
		 
		 	/**
		 	 * weakReference直接回收，不管内存大小
		 	 */
		 	
	    	People p1=new People("zhouqian", 20);
	    	ReferenceQueue<People> rq= new ReferenceQueue<>();
	    	WeakReference<People> reference=new WeakReference<People>(p1,rq);
	        System.out.println(reference.get()); 
	        p1=null;
	        System.gc();//通知JVM回收资源  
	        System.out.println(reference.get());
	        System.out.println(reference.isEnqueued());
	    }  
	}  
	class People{  
	    public String name;  
	    public int age;  
	    byte[] b;
	    public People(String name,int age) {  
	        this.name=name;  
	        this.age=age;  
	       b=new byte[1000*1000*330];
	    }  
	    @Override  
	    public String toString() {  
	        return "[name:"+name+",age:"+age+"]";  
	    }  
}
