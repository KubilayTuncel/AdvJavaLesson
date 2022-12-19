package Threads;

//Thread'ler ayni kaynaga erismek isterlerse ne olacak
public class MultiThreading02 {

    public static  int counter= 0;

    public static void main(String[] args) {
        // ayri iki thread olusturup ayni kaynaga erismesini saglayalim

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
            Counter.count();
                System.out.println("Thread1 calisti");
            }
        });

        thread1.start();

        //2. Thread olsuturuyoruz.
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Counter.count();
                System.out.println("Thread 2 calisti.");
            }
        });

        thread2.start();

    }
}

class  Counter {
    public synchronized static void count(){ //synchronized ekledik ki sadece 1 thread girebiliyor. Bu sekilde counter sonucu farkli sekillerde gelmiyor
                                            // synchronized ilebu methoda giren threadleri siraya koymus olduk.
        for (int i=1; i<=1000; i++){
            MultiThreading02.counter++; //1000
        }

        System.out.println("Counter : " + MultiThreading02.counter);
    }
}
