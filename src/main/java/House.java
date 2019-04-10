import java.util.ArrayList;

public class House {
    public ArrayList<Furniture> furniture;
    private boolean electricity;

    public House(ArrayList<Furniture> furniture) {
        this.furniture = furniture;
        this.electricity = true;
    }
    public void turnLightOn(){
        this.electricity = true;
    }
    public void turnLightOff(){
        this.electricity = false;
    }
    public boolean saveAll(){

        return true;
    }
}
