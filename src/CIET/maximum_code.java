package CIET;
//import java.util.Scanner;

public class maximum_code {
	static int findMax(int[] arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[]  a = {56, 76, 89, 330};
		System.out.println(findMax(a));
 	}
}