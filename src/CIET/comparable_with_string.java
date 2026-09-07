package CIET;
import java.util.*;

class Student3 implements Comparable<Student3> {
	String name;
	Student3(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Student3 other) {
		return this.name.compareTo(other.name);
	}
	public String toString() {
		return name;
	}
}

public class comparable_with_string {
	public static void main(String[] args) {
		ArrayList<Student3> child1 = new ArrayList<>();
        child1.add(new Student3("Ravi"));
        child1.add(new Student3("Anil"));
        child1.add(new Student3("siva"));
        child1.add(new Student3("Thanu"));
        System.out.println(child1);
        Collections.sort(child1);
        System.out.println(child1);
	
	}
} 