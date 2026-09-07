package CIET;
import java.util.concurrent.*;
public class Custom_executers {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		CompletableFuture<Integer> future=CompletableFuture.supplyAsync(()-> {
			System.out.println("Running in"+Thread.currentThread().getName());
			return 100;
		},executor);
	future.thenApply(value->value + 50).thenAccept(result -> {
		System.out.println("Result =" + result);
	}).join();
	executor.shutdown();
	}
}