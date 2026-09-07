package CIET;
import java.util.Scanner;
import java.util.Arrays;
public class reverse_Code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num = sc.nextInt();
		int reverse = 0;
		while (num!=0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		System.out.println("The number is : "+ reverse);
	}

}
