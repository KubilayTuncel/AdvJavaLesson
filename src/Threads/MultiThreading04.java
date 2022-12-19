package Threads;

public class MultiThreading04 {
    public static void main(String[] args) throws InterruptedException {

        Brackets2 brackets2 = new Brackets2();
        long startTime = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
           for (int i=1;i<=7;i++){
               brackets2.generateBrackets();
           }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=7;i++) {
                    brackets2.generateBrackets();
                }
            }
        }) ;

        thread2.start();
        thread1.join();
        thread2.join();

        long entTime = System.currentTimeMillis();

        System.out.println("Toplam gecen süre = "+(entTime-startTime)); //3803 saniye ilk cikti
                                                                        //1909 saniye 2. cikti.
    }
}

class Brackets2 {

    public void generateBrackets (){
       synchronized (this) { //burada sadece döngüyü sekronize edebiliyoruz.
           for (int i=1;i<=10;i++) {

               if (i<=5) {
                   System.out.print("[");
               }else {
                   System.out.print("]");
               }
           }
           System.out.println("");
       }
        for (int i=1;i<=5;i++) {
            try {
                Thread.sleep(50);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}