package CIET;
import java.util.*;
import java.io.*;
public class Hash_map {
	public static void main(String[] args) {
		HashMap <Integer, String> Scanner = new HashMap<>();
		Scanner.put(101, "Dakshanya");
		Scanner.put(null, "Srimani");
		Scanner.put(102, "Susmitha");
		Scanner.put(103,null);
		
		System.out.println(Scanner);
		System.out.println(Scanner.get(101));
		System.out.println(Scanner.containsKey(101));
		System.out.println(Scanner.containsValue("Dakshanya"));
		
		
	}
}
