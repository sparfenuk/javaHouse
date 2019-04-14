import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class WashingMachine extends Furniture {
    private transient Short volume;
    private transient int temperature;
    private Date time;




    public Short getVolume() {
        return volume;
    }

    public void setVolume(Short volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
