package com.bcl.exception;
/**
 * 
 * @author bcl
 *	异常封装和传递，下层的异常往上抛
 */
public class A1_ExceptionChaining {
	public static void main(String[] args) {
		A1_ExceptionChaining t = new A1_ExceptionChaining();
		try {
			t.f();
		}catch(MyException2 e){
			//System.out.println(e.getCause().getMessage());//getCause()获取下一层异常
			e.printStackTrace();
		}
	}
	 void f() throws MyException2{
		 try {
				g();
			}catch(MyException2 e){
				//throw new MyException2();
				throw new MyException2("MyException2 throw",e);
			}
	 }
	 void g() throws MyException2 {
		Exception e=new NullPointerException();
		throw new MyException2("MyException1 throw",e);
	}
	class MyException1 extends Exception {
		public MyException1(String msg) {
			super(msg);
		}
	}
	class MyException2 extends Exception{
		public MyException2(String msg) {
			super(msg);
		}
		public MyException2(Throwable cause) {
			super(cause);
		}
		public MyException2(String msg,Throwable cause) {
			super(msg,cause);
		}
		public MyException2() {
			super();
		}
	}
}
