package models;

import java.util.ArrayList;

public class House {
    public ArrayList<Furniture> furniture;

    public boolean electricity;

    public House() {
        this.furniture = new ArrayList<Furniture>(){};
        this.electricity = true;
    }

    public House(ArrayList<Furniture> furniture) {
        this.furniture = furniture;
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
            furniture.set(i,Furniture.DeSerialize(furniture.get(i).getClass().getName()));
    }


    Runnable myRunnable = new Runnable(){
        @Override
        public void run() {
            while (true) {
                try{
                    saveAllFurniture();
                    Thread.sleep(60000);
                }
                catch(InterruptedException e){
                    System.out.println("save error");
                }
            }
        }
    };
}
