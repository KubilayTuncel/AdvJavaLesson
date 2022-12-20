package Practice.MultiThreads.ThreadPool;

/*
Thread yaratmak cidden maliyetli bir olaydır. Her Thread için sistemde belli bir kaynak ayrılır.
Bu kaynaklar CPU, Hafıza gibi önemli olanlardır. Uygulamamız çalışırken belli miktarda bir Thread
ile sınırlandırmak isteyebiliriz.

Bu nedenle Thread havuzu oluşturup bu havuzu önceden oluşturulmuş ve kullanıma hazır Thread nesneleri
ile doldururuz. Böylece, performans kazanımı ve sistem kaynaklarının verimli kullanımını sağlayabiliriz.

Task: Bir randevu oluşturma uygulaması tasarlayınız.(AppoinmentCenter)
      Uygulama herbir talep için bir gün sonrasına tarih
      vermelidir. 5 kişi için randevu alınmak isteniyor.
      Thread havuzu oluşturup işleri 3 threade yaptırınız.
*/

import java.security.Provider;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppointmentApp02 {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        String[] users = {"Tolstoy","Victor Hugo","Balzac","Dostoyevski","John Steinbeck","C. Dickens"};
        AppointmentCenter02 apo2 = new AppointmentCenter02();

        for (String user:users
             ) {

            MyThread thread = new MyThread(apo2);
            service.execute(thread);
        }

        service.shutdown();


    }
}

class MyThread extends Thread{

    private AppointmentCenter02 appointmentCenter02;

    public MyThread(AppointmentCenter02 appointmentCenter02) {
        this.appointmentCenter02 = appointmentCenter02;
    }

    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        System.out.println(tname + " basladi.");
        System.out.println("Randevu tarihiniz : "+appointmentCenter02.getAppoinmentDate());
        System.out.println("...."+tname+" bitti.");
    }
}
