package models;

import java.util.Date;

public class CoffeeMaker extends Furniture {
    private String Volume;
    private transient int Temperature;
    private transient Date time;


    public String getInclusion() {
        return Volume;
    }

    public void setInclusion(String inclusion) {
        Volume = inclusion;
    }

    public int getTemperature() {
        return Temperature;
    }

    public void setTemperature(int temperature) {
        Temperature = temperature;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
