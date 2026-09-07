package CIET;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_String {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
            "Ravi", "pallavi", "Anil", "Priya", "Suresh", "John"
        );

        List<String> result = names.stream()
                .filter(name -> name.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Final List: " + result);
    }
}