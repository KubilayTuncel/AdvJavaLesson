package Practice.MultiThreads.Creation;

public class ThreadCreation03 {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Anonymous_Thread");
                String name = Thread.currentThread().getName();
                for (int i=1; i<=100;i++) {
                    System.out.println(name + ": kaciyorum");
                }
            }
        });

        thread1.start();

        Thread thread2 = new Thread(()->{
            Thread.currentThread().setName("Lamda_Thread");
            String name = Thread.currentThread().getName();
            for (int i=1; i<=100;i++) {
                System.out.println(name + ": yakalayacagim");
            }
        });

        thread2.start();
    }
}

