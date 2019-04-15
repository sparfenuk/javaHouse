package models;

import java.util.Date;

public class AlarmСlock extends Furniture  {


    private transient Short volume;
    private transient Integer temperature;
    private  Date time;


    public AlarmСlock( int temperature, Date time, Integer timer) {
        super(2000);

        this.temperature = temperature;
        this.time = time;
        super.timer = timer;

    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
