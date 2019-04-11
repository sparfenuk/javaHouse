import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class WashingMachine extends Furniture {
    public transient String Inclusion;
    public transient int Temperature;
    public Date time;
    public transient int ProcesWashing = 0;


    public void TimerWashing( int c) {
        if (c > 0) {
            final Timer writeTime = new Timer();
            writeTime.schedule(new TimerTask() {

                @Override
                public void run(){
                    if(ProcesWashing < 100) {
                        ProcesWashing = ProcesWashing + 10;
                        System.out.print(ProcesWashing + "% " + '\n');
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
