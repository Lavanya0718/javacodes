package CIET;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = sc.nextLine();

        String results = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            results = results + ch;
        }

        System.out.println(results);

        sc.close();
    }
}