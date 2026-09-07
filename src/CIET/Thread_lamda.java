package CIET;

public class Thread_lamda {

    void display() {
        System.out.println("Task is running...");
    }

    public static void main(String[] args) {

        Thread_lamda task = new Thread_lamda();

        Thread t = new Thread(() -> {
            task.display();
            System.out.println("Thread is running using Lambda Expression");
        });

        t.start();
    }
}