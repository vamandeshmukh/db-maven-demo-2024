package com.db.demo.fundas;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Callable solves problem of Runnable using Future object

public class CallableDemo implements Callable<Integer> {

	Integer num = 0;

	public CallableDemo() {
	}

	public CallableDemo(Integer arg) {
		num = arg;
	}

	@Override
	public Integer call() throws Exception {
//		int total = 0;
//		for (int i = 1; i < 10; i++) {
//			total = total + i;
//		}
		return Maths.sum(num);
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CallableDemo mt1 = new CallableDemo();

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		Future<Integer> future = executorService.submit(mt1);
		
//		Optional<Object> obj = null;

		Integer total = future.get();
		System.out.println(total);
		executorService.shutdown();
	}
}

class Maths {

	static Integer sum(Integer a) {
		return a;
	}

}