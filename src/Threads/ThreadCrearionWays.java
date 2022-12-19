package Threads;

public class ThreadCrearionWays {

    public static void main(String[] args) {
        //ilk calisan thread main Thread dir. Kontrol ettik
        System.out.println("Current Thread : " + Thread.currentThread().getName());

        MyThread thread1 = new MyThread();
        thread1.start(); //Thread sinifinda run method da yazilanlar islenmeye baslar.
        //start dedigimiz icin thread multitask olarak calismasini sagliyoruz fakat thread1.run() olarak cagirdigimiz zaman
        //thread olusmuyor sadece run methodunu calistirmis oluyoruz. MyThread class in daki diger kisimlar calismaz.

        //Runnable interface i kullandigimiz icin iki asamali olarak thread islemini gerceklestirebiliyoruz.
        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();

        // isimsiz olarak thread olusturma; annoyms (Interface)

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                //Thread.sleep(5000);
                System.out.println("Current Thread : " + Thread.currentThread().getName());
                System.out.println("Bu isimsiz sinif yoluyla olusturulan is parcacigidir");
            }
        });
        thread3.setName("Thread3");
        thread3.start();
        //isimsiz 2. yol thread olusturma
        Thread thread4 = new Thread(()->{
            System.out.println("lamda ile yazildi");
        });
        thread4.start();
        System.out.println("Main methodu bitti");
        Thread thread5 = new Thread(()->{
            System.out.println("thread5 calisti");
        });
        thread5.start();

    }





}

//1. yol : Threads classindan extend ederek
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread thread i calisiyor");
    }
}

//2. yol : Runnuable Interface i imp. ederek

class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable Interfaceden türetilen thread calisti.");
    }
}
