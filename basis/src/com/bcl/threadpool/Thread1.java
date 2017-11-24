package com.bcl.threadpool;

import java.util.concurrent.Callable;

public class Thread1 implements Callable<String>{

	@Override
	public String call() throws Exception {
		return "123";
	}

}
