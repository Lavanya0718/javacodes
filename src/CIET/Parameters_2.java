package CIET;

@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class Parameters_2 {
    public static void main(String[] args) {

        Greeting g = () -> System.out.println("Hello!");

        g.sayHello();
    }
}