package Practice.MultiThreads.Creation;

public class ThreadCreation02 {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Yaris baslasin ...");

        Counter c1 = new Counter("RoadRunner");
        Counter c2 = new Counter("SpeedyGonzales");

        Thread thread1 = new Thread(c1);
        Thread thread2 = new Thread(c2);
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Yaris bitti ....");

    }
}
