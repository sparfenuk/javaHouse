package models;

import java.util.Date;

public class Conditioner extends Furniture {

    private Integer volume;
    private transient Short temperature;
    private Date time;
    private transient Short usedWork;

    public Conditioner(int interval, Integer volume, Short temperature, Date time, Short usedWork, Integer timer) {
        super(3600000);
        this.volume = volume;
        this.temperature = temperature;
        this.time = time;
        this.usedWork = usedWork;
        super.timer = timer;
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
