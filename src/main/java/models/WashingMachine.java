package models;

import java.util.Date;

public class WashingMachine extends Furniture {
    private transient Short volume;
    private transient int temperature;
    private Date time;


    public WashingMachine(Short volume, int temperature, Date time) {
        super(300000);
        this.volume = volume;
        this.temperature = temperature;
        this.time = time;
    }

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
