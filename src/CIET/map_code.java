package CIET;
import java.util.Scanner;
import java.util.*;
import java.io.*;
public class map_code {
	public static void main(String[] args) {
		Map <Integer, String> students = new HashMap<>();
		students.put(100, "Dakshanya");
		students.put(101, "Srimani");
		students.put(103, "Susmitha");
		
		System.out.println(students);
		System.out.println(students.get(100));
		students.remove(101);
		System.out.println(students);
		students.put(100, "Lavanya");
		System.out.println(students);
	}
}
