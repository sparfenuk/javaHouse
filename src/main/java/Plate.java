import java.util.Date;

public class Plate extends Furniture {

    public transient String inclusion;
    public transient Integer temperature;
    public Date time;
    public transient int usedWork;

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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
