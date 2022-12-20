package Practice.MultiThreads.Creation;

public class Sayac extends Thread{

    private String name;

    public Sayac(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name+ " basladi.");
        for (int i=1;i<=100;i++){
            System.out.print(i);
        }
        System.out.println(this.name+ " bitirdi.");
    }
}
