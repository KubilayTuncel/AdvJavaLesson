package Threads;

import java.util.concurrent.CountDownLatch;

public class CountDownLatch01 {
    //toplu olarak bazi tread leri öncelikli olarak calistirmamizi sagliyor

    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(4);

        WorkerThreads threads1 = new WorkerThreads("Worker-1",5000,latch);
        WorkerThreads threads2 = new WorkerThreads("Worker-2",7000,latch);
        WorkerThreads threads3 = new WorkerThreads("Worker-3",9000,latch);
        WorkerThreads threads4 = new WorkerThreads("Worker-4",11000,latch);

        //start()
        threads1.start();
        threads2.start();
        threads3.start();
        threads4.start();

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " has finished");

    }
}

class WorkerThreads extends Thread {

    private  int delay;
    private CountDownLatch latch;

    // const.
    public WorkerThreads(String name,int delay, CountDownLatch latch) {
        super(name);
        this.delay = delay;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(delay);
            System.out.println(Thread.currentThread().getName()+" calisiyor");
            latch.countDown();
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
