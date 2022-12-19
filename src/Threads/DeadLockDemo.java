package Threads;

public class DeadLockDemo {



    public static void main(String[] args) {
        final String lock1 = "lock1";
        final String lock2 = "lock2";
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1){
                    System.out.println("Thread1, lock1 degiskeni kilitkendi");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lock2) {
                        System.out.println("Thread1 lock2 degiskeni kitlendi.");
                }


                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1){
                    System.out.println("Thread2, lock2 degiskeni kilitkendi");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (lock2) {
                        System.out.println("Thread2 lock1 degiskeni kitlendi.");
                }

                }
            }
        });
        thread2.start();
    }
}
