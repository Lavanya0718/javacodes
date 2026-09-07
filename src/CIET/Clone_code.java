package CIET;
import java.util.Scanner;
public class Clone_code {
	public static void main(String[] args) {
		int[] a = {10,20,30};
		int[] b = a.clone();
		b[0]=100;
		System.out.println(a[0]);
		System.out.println(b[0]);
		
	}
	

}
