package Practice.MultiThreads.WaitNotify;

public class ShopWaitNotify {

    public static int stock=0;

    public static void main(String[] args) {

        ShopWaitNotify shop = new ShopWaitNotify();
        Thread conThread = new Thread(new Runnable() {
            @Override
            public void run() {
                shop.consumeProduct(3);
            }
        });
        conThread.setName("Tüketici");
        conThread.start();

        Thread proThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                shop.produceProduct(5);
            }
        });
        proThread.setName("Üretici");
        proThread.start();

    }

    public synchronized void consumeProduct(int amount) {
        if (amount>stock){
            System.out.println(Thread.currentThread().getName()+ " ürün almak istiyor.");
            System.out.println("Yeterli ürün yok, Güncel ürün stogu : "+stock);
            System.out.println("Tüketici ürün girisi yapilmasini bekliyor");

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (amount<=stock){
            System.out.println(Thread.currentThread().getName()+ " ürün almak istiyor.");
            System.out.println("Ürün satin alindi, stoktan düsülüyor");
            stock=stock-amount;
            System.out.println("Güncel stock : "+stock);
        }else {
            System.out.println(Thread.currentThread().getName()+ " ürün almak istiyor.");
            System.out.println("Yeterli ürün yok, Güncel ürün stogu : "+stock);
            System.out.println("Bugün git yarin gel :D");
        }
    }

    public synchronized void produceProduct(int amount) {
        System.out.println(Thread.currentThread().getName()+ " ürün eklemek istiyor");
        System.out.println("Yeni ürünler eklendi. stock güncelleniyor.");
        stock = stock+amount;
        System.out.println("Güncel stock : " +stock);
        notify();
    }
}
