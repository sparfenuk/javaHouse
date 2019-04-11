import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class CoffeeMaker extends Furniture {
    public transient String Inclusion;
    public transient int Temperature;
    public Date time;
    public transient int ProceCoffe = 0;

    public void TimerCoffe ( int c) {
        if (c > 0) {
            final Timer writeTime = new Timer();
            writeTime.schedule(new TimerTask() {

                @Override
                public void run(){
                    if(ProceCoffe < 100) {
                        ProceCoffe = ProceCoffe + 10;
                        System.out.print(ProceCoffe + "% " + '\n');
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
