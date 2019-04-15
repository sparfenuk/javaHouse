package models;

import javafx.concurrent.Task;
import javafx.scene.control.ProgressIndicator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public abstract class Furniture extends Task<Void> implements Serializable {
    private Short electricityLevel;
    private Short status;
    private Short processClock= 0;
    public Integer timer = 0; //seconds
    private int interval;

    public Furniture() {
        electricityLevel = 0;
        status = Status.ON;
    }

    public Furniture(int interval) {
        electricityLevel = 0;
        status = Status.ON;
        this.interval = interval;
    }


    public Short getProcessClock() {
        return processClock;
    }

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

    public static List<Furniture> deSerializeAll()
    {

        List<Furniture> furnitures = new ArrayList<>();

        File dir = new File(".");

        File[] listOfFiles = dir.listFiles(new FilenameFilter() { @Override public boolean accept(File dir, String name) { return name.endsWith(".frn"); } });

        for (File f:listOfFiles
        ) {
            if (f.isFile())
                System.out.println(f.getName().replaceFirst("[.][^.]+$", ""));
            furnitures.add(Furniture.DeSerialize(f.getName().replaceFirst("[.][^.]+$", "")));
        }

        return furnitures;
    }

    @Override
    protected Void call() throws Exception {
        this.updateProgress(ProgressIndicator.INDETERMINATE_PROGRESS, 1);
        this.updateMessage("Running...awa");

        for(int i = 0; i < timer; i++)
        {
            this.updateMessage("Running..." + i);
            this.updateProgress((1.0 * i)/timer,1);
            Thread.sleep(1000);

        }
        this.updateMessage("Done");
        this.updateProgress(1,1);
        return null;
    }


    @Override
    public String toString() {
        return "models.Furniture{" +
                "electricityLevel=" + electricityLevel +
                ", status=" + status +
                '}';
    }
}
