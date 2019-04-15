import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.*;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class main extends Application {


        @Override
        public void start(Stage primaryStage) throws Exception {

//
//
            List<Furniture> objects = new ArrayList<>();
            objects.add(new AlarmСlock(30,new Date(),4000));
            Furniture f = new AlarmСlock(30,new Date(),0);

            objects.add(f);
//
//           ObservableList<Furniture> obList = FXCollections.observableArrayList(objects);
//
//            TableView<Furniture> tableView = new TableView<>();
//
//
//            TableColumn<Furniture,Short> elLvlCol = new TableColumn<>("Electricity Level");
//            elLvlCol.setCellValueFactory(new PropertyValueFactory<>("electricityLevel"));
//
//            TableColumn<Furniture, Status> statusCol = new TableColumn<>("models.Status");
//            statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
//
//            TableColumn<Furniture,String> inclusionCol = new TableColumn<>("Inclusion");
//            inclusionCol.setCellValueFactory(new PropertyValueFactory<>("Inclusion"));
//
//            TableColumn<Furniture,Integer> temperatureCol = new TableColumn<>("Temperature");
//            temperatureCol.setCellValueFactory(new PropertyValueFactory<>("Temperature"));
//
//            TableColumn<Furniture, Date> timeCol = new TableColumn<>("Time");
//            timeCol.setCellValueFactory(new PropertyValueFactory<>("time"));
//
//            TableColumn<Furniture, Double> timerCol = new TableColumn<>("Alarm");
//            timerCol.setCellValueFactory(new PropertyValueFactory<>("Progress"));
//            timerCol.setCellFactory(ProgressBarTableCell.forTableColumn());
//
//
//
//
//
//
//
//
//
//
//
//
//            tableView.getColumns().addAll(elLvlCol,statusCol,inclusionCol,temperatureCol,timeCol, timerCol);
//
//
//
//            tableView.setItems(obList);
//            ExecutorService executor = Executors.newFixedThreadPool(tableView.getItems().size(), new ThreadFactory() {
//                @Override
//                public Thread newThread(Runnable r) {
//                    Thread t = new Thread(r);
//                    t.setDaemon(true);
//                    return t;
//                }
//            });
//
//            for (Furniture task : tableView.getItems()) {
//                executor.execute(task);
//            }
          // Parent root = FXMLLoader.load(getClass().getResource("/Table.fxml"));

//            root.setPadding(new Insets(5));
//            root.getChildren().add(tableView);

//            Stage stage = new Stage();
//
//            Scene scene = new Scene(root);
//            primaryStage.setScene(scene);
//            primaryStage.show();
            System.out.println("dsadasdasdasdadasd");

            Parent root = FXMLLoader.load(getClass().getResource("/Table.fxml"));//
            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.setTitle("Table");
            primaryStage.show();





        }

        public static void main(String[] args){
            launch(args);
//            House h = new House();
//            h.furniture.add(new AlarmСlock(30,new Date(),4000));
//            h.furniture.add(new CoffeeMaker((short)30,200,new Date(),4000));
//
//            h.saveAllFurniture();
//
//            h.setAllFurniture();
//
//            System.out.println(h.furniture.get(1).toString());

        }
    }