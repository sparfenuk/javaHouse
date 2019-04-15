import java.util.Date;

public class AlarmСlock extends Furniture  {

    private transient String inclusion;
    private transient int temperature;
    private Date time;


    public AlarmСlock(String inclusion, int temperature, Date time, int timer) {
        super(2000);
        this.inclusion = inclusion;
        this.temperature = temperature;
        this.time = time;
        super.timer = timer;
    }

    public String getInclusion() {
        return inclusion;
    }

    public void setInclusion(String inclusion) {
        this.inclusion = inclusion;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
