import java.io.*;
import java.util.ArrayList;

public abstract class Furniture implements Serializable {
    private short electricityLevel;
    private Status status;

    public Furniture() {}

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public short getElectricityLevel() {
        return electricityLevel;
    }

    public void setElectricityLevel(short electricityLevel) {
        this.electricityLevel = electricityLevel;
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

}
