package CIET;
import java.util.Scanner;
public class Create_method {
	int dog(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Create_method l = new Create_method();
		int a = l.dog(10,20);
		System.out.println(a);
		
	}
	

}
