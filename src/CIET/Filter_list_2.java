package CIET;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_list_2 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
            5, 12, 8, 15, 20, 3, 12, 8, 25, 30
        );

        List<Integer> result = numbers.stream()
            .distinct()
            .filter(n -> n > 10)
            .sorted((a, b) -> b - a)
            .limit(3)
            .collect(Collectors.toList());

        int Sum = result.stream()
            .reduce(0, Integer::sum);

        System.out.println(result);
        System.out.println("Sum = " + Sum);
    }
}