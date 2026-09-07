package CIET;
import java.util.Scanner;
import java.util.Arrays;

public class armstrong_Code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int original = num;
		int sum = 0;
		while (num != 0) {
			int digit = num % 10;
			sum = sum + (digit * digit * digit);
			num = num / 10;
		}
		if (original == sum) {
			System.out.println(original + " is armstrong.");
		}
		else {
			System.out.println(original + " is not armstrong.");
		}
	}
}
	


