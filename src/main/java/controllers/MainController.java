package controllers;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.ProgressBarTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import models.AlarmСlock;
import models.Furniture;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;
import models.House;
import models.Status;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class MainController  {

    @FXML
    private TableView<Furniture> tableVHouse;

    @FXML
    private ToggleButton toggleBOnOff;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    private House house = new House();

    private ObservableList<Furniture> obList;


    @FXML
    void initialize() {

      //  house.setAllFurniture();
       // if(house.furniture == null) {

            List<Furniture> objects = new ArrayList<>();

//            objects.add(new AlarmСlock("Clock i guess", 21, new Date(), 120));
//            objects.add(new AlarmСlock("Clock i guess", 21, new Date(), 0));

          //  house.furniture = (ArrayList<Furniture>) objects;
           // house.saveAllFurniture();
            obList = FXCollections.observableArrayList(objects);
            tableVHouse.setItems(obList);
      //  }
      //  else
      //  {
     //       obList = FXCollections.observableArrayList(house.furniture);
     //   }


        TableColumn<Furniture,Short> elLvlCol = new TableColumn<>("Electricity Level");
        elLvlCol.setCellValueFactory(new PropertyValueFactory<>("electricityLevel"));

        TableColumn<Furniture, Status> statusCol = new TableColumn<>("Status");
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        TableColumn<Furniture,String> inclusionCol = new TableColumn<>("Inclusion");
        inclusionCol.setCellValueFactory(new PropertyValueFactory<>("Inclusion"));

        TableColumn<Furniture,Integer> temperatureCol = new TableColumn<>("Temperature");
        temperatureCol.setCellValueFactory(new PropertyValueFactory<>("Temperature"));

        TableColumn<Furniture, Date> timeCol = new TableColumn<>("Time");
        timeCol.setCellValueFactory(new PropertyValueFactory<>("time"));


        TableColumn<Furniture, Integer> timerCol = new TableColumn<>("Timer");
        timeCol.setCellValueFactory(new PropertyValueFactory<>("timer"));


        TableColumn<Furniture, String> progressStatusCol = new TableColumn<>("Status of progress");
        progressStatusCol.setCellValueFactory(new PropertyValueFactory<>("message"));


        TableColumn<Furniture, Double> progressCol = new TableColumn<>("Progress");
        progressCol.setCellValueFactory(new PropertyValueFactory<>("Progress"));
        progressCol.setCellFactory(ProgressBarTableCell.forTableColumn());

        tableVHouse.getColumns().addAll(elLvlCol,statusCol,inclusionCol,temperatureCol,timeCol,timerCol,progressStatusCol,progressCol);



        ExecutorService executor = Executors.newFixedThreadPool(tableVHouse.getItems().size(), new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread t = new Thread(r);
                t.setDaemon(true);
                return t;
            }
        });
        for (Furniture task : tableVHouse.getItems()) {
            executor.execute(task);
        }
       // executeThreads();


    }



    private void executeThreads()
    {

        ExecutorService executor = Executors.newFixedThreadPool(tableVHouse.getItems().size(), new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread t = new Thread(r);
                t.setDaemon(true);
                return t;
            }
        });
        for (Furniture task : tableVHouse.getItems()) {
            executor.execute(task);
        }
    }


    public void onTglBClick(MouseEvent mouseEvent) {

        if(!house.electricity)
        {

            house.electricity = true;
            house.setAllFurniture();
            //tableVHouse.setItems(FXCollections.observableArrayList(house.furniture));
            toggleBOnOff.setText("OFF");

        }
        else
        {

            house.electricity = false;
            house.saveAllFurniture();
            toggleBOnOff.setText("ON");

        }


    }
}
