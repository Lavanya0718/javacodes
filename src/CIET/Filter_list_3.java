package CIET;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_list_3 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
            "Chandan", "Anil", "Anil", "Rahul",
            "Arjun", "Raj", "Ananya"
        );

        List<String> result = names.stream()
            .filter(name -> name.startsWith("A"))
            .map(String::toUpperCase)
            .sorted()
            .collect(Collectors.toList());

        System.out.println(result);
    }
}
