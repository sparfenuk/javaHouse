import java.util.Date;

public class Conditioner extends Furniture {

    private Integer volume;
    public transient Short temperature;
    public Date time;
    public transient Short usedWork;

    public Conditioner(Integer volume, Short temperature, Date time, Short usedWork) {
        super((short)(Math.random()*30),Status.ON,20000);
        this.volume = volume;
        this.temperature = temperature;
        this.time = time;
        this.usedWork = usedWork;

    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(short temperature) {
        this.temperature = temperature;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
