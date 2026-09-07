package CIET;
import java.util.List;
import java.util.Scanner;
public class Even_numbers {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
		List<Integer> evenNumbers = numbers.stream()
				.filter(n -> n % 2 == 0) 
				.toList();
		System.out.println("Even numbers:");
		System.out.println(evenNumbers);
		
	}

}
