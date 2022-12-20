package Practice.MultiThreads.ThreadPool;

import java.time.LocalDate;

public class AppointmentCenter02 {


    private LocalDate day = LocalDate.now();
    public synchronized LocalDate getAppoinmentDate () {

        day = day.plusDays(1);

        return day;
    }
}
