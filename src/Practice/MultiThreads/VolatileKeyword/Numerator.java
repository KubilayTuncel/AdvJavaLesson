package Practice.MultiThreads.VolatileKeyword;

public class Numerator {

    private volatile static int counter = 0;
    //volatile keywordü degiskenin main memory de saklanmasini garanti eder
    //Ancak tüm threadlerin degiskene ayni anda ulasmasindan kaynakli cakismaya cözme garantisi yoktur.

    public synchronized void getOrder() {

        String name =Thread.currentThread().getName();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counter++;
        System.out.println("Sayin "+name+ " siraniz "+counter);
    }
}
