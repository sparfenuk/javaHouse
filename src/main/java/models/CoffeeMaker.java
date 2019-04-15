package models;

import java.util.Date;

public class CoffeeMaker extends Furniture {
    private Short volume;
    private transient Integer Temperature;
    private transient Date time;

    public CoffeeMaker(Short volume, Integer temperature, Date time) {
        super(2000);
        this.volume = volume;
        Temperature = temperature;
        this.time = time;
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
