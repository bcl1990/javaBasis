package com.bcl.test;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

public class Test2 {  
    public static void main(String[] args) {  
        /*WeakReference<People>reference=new WeakReference<People>(new People("zhouqian",20));  
        System.out.println(reference.get());  
        System.gc();//通知GVM回收资源  
        System.out.println(reference.get()); */ 
    	People p1=new People("zhouqian", 20);
    	People p2=new People("11", 22);
    	ReferenceQueue<People> rq= new ReferenceQueue<>();
    	SoftReference<People> reference=new SoftReference<People>(p2);
    	PhantomReference<People> pf =new PhantomReference<People>(p1, rq);
    	PhantomReference<People> pf2 =new PhantomReference<People>(p2, rq);
    	p1=null;
    	
        System.out.println(reference.get()); 
        byte[] b=new byte[1000*1000*1];
        System.gc();//通知GVM回收资源  
        System.out.println(reference.get());
        System.out.println(reference.isEnqueued());
        System.out.println(pf.isEnqueued());//true
        System.out.println(pf2.isEnqueued());//false
        //System.gc();//通知GVM回收资源  
        //System.out.println(reference.get());
    }  
}  
class People{  
    public String name;  
    public int age;  
    byte[] b;
    public People(String name,int age) {  
        this.name=name;  
        this.age=age;  
       b=new byte[1000*1000*333];
    }  
    @Override  
    public String toString() {  
        return "[name:"+name+",age:"+age+"]";  
    }  
}  
