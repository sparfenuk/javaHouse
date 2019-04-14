import java.io.*;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public abstract class Furniture implements Serializable {
    private Short electricityLevel;
    private Short status;
    public Short processClock= 0;
    private int interval;

    public Furniture() {}

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public short getElectricityLevel() {
        return electricityLevel;
    }

    public void setElectricityLevel(short electricityLevel) {
        this.electricityLevel = electricityLevel;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public Furniture(Short electricityLevel, Short status, int interval) {
        this.electricityLevel = electricityLevel;
        this.status = status;
        this.processClock = 0;
        this.interval = interval;
    }

    public Furniture(Short electricityLevel, Short status) {
        this.electricityLevel = electricityLevel;
        this.status = status;
        this.processClock = 0;
        this.interval = 0;
    }

    public void TimerClock (Short c) {
        if (c > 0) {
            final Timer writeTime = new Timer();
            writeTime.schedule(new TimerTask() {
                @Override
                public void run(){
                    if(processClock < 100) {
                        processClock = (short)(processClock + 5);
                        System.out.print(processClock + "%" + '\n');
                    }
                }
            },interval,c);
        }
    }

    public static boolean Serialize(Furniture furniture){
        try {
            FileOutputStream fos = new FileOutputStream(furniture.getClass().getName() + ".frn");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(furniture);
            fos.close();
            oos.close();
            return true;

        }
        catch (Exception e){return false;}

    }
    public static Furniture DeSerialize(String className){
        try {

            FileInputStream fis = new FileInputStream(className+ ".frn");
            ObjectInputStream oin = new ObjectInputStream(fis);
            Furniture furniture = (Furniture) oin.readObject();

            oin.close();
            fis.close();

            return furniture;
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
            return null;
        }
        catch (ClassNotFoundException c)
        {
            System.out.println("Class not found");
            c.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "electricityLevel=" + electricityLevel +
                ", status=" + status +
                '}';
    }
}
