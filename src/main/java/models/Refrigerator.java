package models;

import java.util.Date;

public class Refrigerator extends Furniture {
    private Integer inclusion;
    private transient int temperature;
    private Date time;
    private int usedWork;

    public Refrigerator(Integer inclusion, int temperature, Date time, int usedWork) {
        super();
        this.inclusion = inclusion;
        this.temperature = temperature;
        this.time = time;
        this.usedWork = usedWork;
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

    public int getUsedWork() {
        return usedWork;
    }

    public void setUsedWork(int usedWork) {
        this.usedWork = usedWork;
    }
}
