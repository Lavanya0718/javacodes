package CIET;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
public class array_as_list {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
		List<Integer> evenNumbers = numbers.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(evenNumbers);
	}

}
