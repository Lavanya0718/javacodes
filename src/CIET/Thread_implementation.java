package CIET;

public class Thread_implementation implements Runnable {

    public void run() {
        System.out.println("task running");
    }

    public static void main(String[] args) {

        Thread thread = new Thread(new Thread_implementation());
        thread.start();

    }
}