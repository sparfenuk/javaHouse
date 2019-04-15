package models;

import java.util.Date;

public class Plate extends Furniture {

    private transient Integer inclusion;
    private transient Integer temperature;
    private Date time;
    public transient int usedWork;

    public Plate(Short electricityLevel, Integer inclusion, Integer temperature, Date time) {
        super();
        this.inclusion = inclusion;
        this.temperature = temperature;
        this.time = time;
    }

    public Integer getInclusion() {
        return inclusion;
    }

    public void setInclusion(Integer inclusion) {
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
