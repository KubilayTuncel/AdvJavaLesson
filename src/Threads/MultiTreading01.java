package Threads;

public class MultiTreading01 {

    public static void main(String[] args) throws InterruptedException {

        long startTime =  System.currentTimeMillis();

        CounterWithoutMultiThread counter1 = new CounterWithoutMultiThread(1);
        CounterWithoutMultiThread counter2 = new CounterWithoutMultiThread(2);

        counter1.countMe();
        System.out.println("------------");
        counter2.countMe();

        long endTime = System.currentTimeMillis();

        System.out.println("withoutMultiThread ile gecen süre = "+(endTime-startTime));

        long startTime2=System.currentTimeMillis();

        CounterWithMultiThread counter3 = new CounterWithMultiThread(3);
        CounterWithMultiThread counter4 = new CounterWithMultiThread(4);
        counter3.start();
        System.out.println("---------------");
        counter4.start();

        counter3.join();
        counter4.join(); //join methodu thread kismini bitirdikten sonra alt satira gec demek.

        long endTime2 = System.currentTimeMillis();
        System.out.println("WithMultiThread ile Gecen süre = "+ (endTime2-startTime2));
    }
}

class CounterWithoutMultiThread {
    private int threadNum;

    //const.
    public CounterWithoutMultiThread(int threadNum) {
        this.threadNum = threadNum;
    }

    public void countMe() throws InterruptedException{
        for (int i=1; i<=10;i++) {
            Thread.sleep(500);
            System.out.println("i"+ i + "Thread number : " + threadNum);
        }
    }
}

class  CounterWithMultiThread extends Thread{
    private int threadNum;

    public CounterWithMultiThread (int threadNum) {
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        try {
            countMe();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void countMe() throws InterruptedException{
        for (int i=1; i<=10;i++) {
            Thread.sleep(500);
            System.out.println("i"+ i + "Thread number : " + threadNum);
        }
    }
}
