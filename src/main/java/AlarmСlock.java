import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AlarmСlock extends Furniture {

    public transient String Inclusion;
    public transient int Temperature;
    public Date time;
    public transient int ProcesClock= 0;

    public void TimerClock ( int c) {

        if (c > 0) {
            final Timer writeTime = new Timer();
            writeTime.schedule(new TimerTask() {

                @Override
                public void run(){
                    if(ProcesClock < 100) {
                        ProcesClock = ProcesClock + 10;
                        System.out.print(ProcesClock + "% " + '\n');
                    }
                }
            },1000,c);
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
