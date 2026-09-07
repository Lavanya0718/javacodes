package CIET;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
public class Map_Collect_Code {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("john", "alice", "bob");
		List<String> result = names.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(result);
	}

}
