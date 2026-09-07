package CIET;
import java.util.Scanner;
import java.util.Arrays;

public class twoDim_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[2][3];
		for (int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
	}
}


