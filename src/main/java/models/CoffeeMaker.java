package models;

import java.util.Date;

public class CoffeeMaker extends Furniture {
    private Short volume;
    private transient Integer Temperature;
    private transient Date time;

    public CoffeeMaker(Short volume, Integer temperature, Date time,Integer timer) {
        super(2000);
        this.volume = volume;
        Temperature = temperature;
        this.time = time;
        super.timer = timer;
    }

    public Short getVolume() {
        return volume;
    }

    public void setVolume(Short volume) {
        this.volume = volume;
    }

    public Integer getTemperature() {
        return Temperature;
    }

    public void setTemperature(Integer temperature) {
        Temperature = temperature;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
