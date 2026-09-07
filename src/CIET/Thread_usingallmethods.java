package CIET;

public class Thread_usingallmethods extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

        Thread_usingallmethods t1 = new Thread_usingallmethods();
        Thread_usingallmethods t2 = new Thread_usingallmethods();

        t1.setName("Lavanya");
        t2.setName("Susmitha");

        t1.start();
        t2.start();
    }
}