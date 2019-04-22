package ch13.test;

import java.util.concurrent.RecursiveTask;

public class SumTaskMain  {
	public static void main(String[] args) {
		
	}
}


class SumTask extends RecursiveTask<Long>{
	long from, to;
	
	SumTask(long from, long to){
		this.from = from;
		this.to = to;
	}
	
	@Override
	protected Long compute() {
		long size = to - from + 1;
		
		if(size <= 5) {
			return sum();
		}
		long half = (from+to) / 2;
		
		SumTask leftSum = new SumTask(from, half);
		SumTask rightSum = new SumTask(half+1, to);
		
		leftSum.fork();
		
		return rightSum.compute() + leftSum.join();
	}
	
	Long sum() {
		long sum = 0;
		for(long i = from; i < to; i++) {
			sum += i;
		}
		return sum;
	}
	
}
