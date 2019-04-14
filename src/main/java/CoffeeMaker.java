import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class CoffeeMaker extends Furniture {
    public String Volume;
    public transient int Temperature;
    public transient Date time;


    public String getInclusion() {
        return Volume;
    }

    public void setInclusion(String inclusion) {
        Volume = inclusion;
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
