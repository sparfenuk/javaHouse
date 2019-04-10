import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class AlarmСlock extends Furniture {

    public transient String Inclusion;
    public transient int Temperature;
    public Date time;
    public transient int UsedWork;

    public void TimerClock ( int c, int finsh) {
        final Timer time = new Timer();

        if (c > 0) {
            time.schedule(new TimerTask() {
                int i = 0;
                @Override
                public void run() {
                    if (i >= finsh) {
                        System.out.println("Таймер завершил свою работу");
                        time.cancel();
                        return;
                    }
                    System.out.println("Прошло " +c+ " секунды");
                    i = i + 1;
                }
            }, c, c);
        }
    }

    public String getInclusion() {
        return Inclusion;
    }

    public void setInclusion(String inclusion) {
        Inclusion = inclusion;
    }

    public int getTemperature() {
        return Temperature;
    }

    public void setTemperature(int temperature) {
        Temperature = temperature;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
