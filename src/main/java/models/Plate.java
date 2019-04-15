package models;

import java.util.Date;

public class Plate extends Furniture {

    private transient String inclusion;
    private transient Integer temperature;
    private Date time;
    public transient int usedWork;

    public Plate(Short electricityLevel, Short status, String inclusion, Integer temperature, Date time) {
        super();
        this.inclusion = inclusion;
        this.temperature = temperature;
        this.time = time;
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
