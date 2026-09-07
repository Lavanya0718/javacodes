package CIET;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class One{
	public static void main(String[] args) {
		//create a thread pool with 3 threads
		    ExecutorService executor=Executors.newFixedThreadPool(3);
		    
		    //submit task 1 
		    executor.submit(()->{
		    	System.out.println("Task 1 executes by "+ Thread.currentThread().getName());
		    });
		    //submit task 2
		    executor.submit(()->{
		    	System.out.println("Task 2 executes by "+ Thread.currentThread().getName());
		    });
		    executor.submit(()->{
		    	System.out.println("Task 3 executes by "+ Thread.currentThread().getName());
		    });
		    executor.submit(()->{
		    	System.out.println("Task 4 executes by "+ Thread.currentThread().getName());
		    });
		    executor.shutdown();
	}
}