package CIET;
//import java.util.Scanner;

public class method_overloading {
	void add(int a) {
		System.out.println(a);
	}
	void add(double a) {
		System.out.println(a);
	}
	void add(int b, int c) {
		System.out.println(b + c);
	}
	void add(int b, double c) {
		System.out.println(b + c);
	}
	public static void main(String[] args) {
		method_overloading m = new method_overloading();
		m.add(33);
		m.add(69.33);
		m.add(3300 + 69);
	}
}  