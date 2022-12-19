package Threads;

public class WaitNotify {
    public static int balance =0;

    public static void main(String[] args) {

        WaitNotify obj = new WaitNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    obj.withdraw(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.setName("Withdraw Thread");
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                obj.deposit(2000);
            }
        });
        thread2.setName("Deposit Thread");
        thread2.start();

    }

    //para cekme methodu

    public void withdraw(int amount) throws InterruptedException {
        synchronized (this){
            if (balance<=0 || balance < amount) {
                System.out.println("Balance degeri degisesiye kadar bekliyoruz. Balance = "+balance);
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //wait islemi bittikten sonra veya balance yeterli ise
            Thread.sleep(5000);
            balance = balance - amount;
            System.out.println("Para cekme islemi basariyla gerceklesmistir. Balance = "+balance);
        }//sync. blog sonu

    }

    //para yatirma methodu
    public void deposit (int amount) {
        balance = balance + amount;
        System.out.println("Para yetirma isleminiz basariyla gerceklesmistir. Balance = "+ balance);
        synchronized (this) {
            notify();
        }
    }
}
