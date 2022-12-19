package Threads;

public class Volatile {
    volatile public static int flag = 0; //thread ler ram üyerinden degere ulasabilmeleri icin volatile yazdik. yoksa kendi olsuturduklari cpu dan deger alirlar
    // ve bu kod sonsuz döngüye girebilir.

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (flag==0) {
                        System.out.println("Thread 1 calisiyor");
                    }else {
                        break;
                    }
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                flag = 1;
                System.out.println("Flag degeri 1 oldu");
            }


        });
        thread2.start();
    }

}
