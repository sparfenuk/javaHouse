import java.util.ArrayList;

public class House {
    public ArrayList<Furniture> furniture;

    private boolean electricity;

    public House() {
        this.furniture = new ArrayList<Furniture>(){};
        this.electricity = true;
    }
    public void turnLightOn(){
        this.electricity = true;
    }
    public void turnLightOff(){
        this.electricity = false;
    }

    public void saveAllFurniture(){
        for(int i = 0; i < furniture.size() ; i++)
            Furniture.Serialize(furniture.get(i));

    }
    public void setAllFurniture(){
        for(int i = 0; i < furniture.size() ; i++)
            furniture.set(i,Furniture.DeSerialize(furniture.getClass().getName()));
    }
}
