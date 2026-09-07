
package CIET;

class Demo {
    public static <T> void printArray(T[] arr) {
        for (T value : arr) {
            System.out.println(value);
        }
    }
}

public class generic_method_code {
    public static void main(String[] args) {

        String[] names = {"Lavanya", "Dakshanya", "Srimani"};

        Demo.printArray(names);
    }
}

