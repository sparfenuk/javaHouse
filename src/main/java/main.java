import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.ProgressBarTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.text.TabableView;
import java.beans.EventHandler;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;


public class main extends Application {


        @Override
        public void start(Stage primaryStage) throws Exception {



            List<Furniture> objects = new ArrayList<>();
            objects.add(new AlarmСlock("Clock i guess",21,new Date(), 120));
            Furniture f = new AlarmСlock("Clock i guess",21,new Date(),0);
           // ((AlarmСlock) f).TimerClock(12212);
            objects.add(f);

           ObservableList<Furniture> obList = FXCollections.observableArrayList(objects);

            TableView<Furniture> tableView = new TableView<>();


            TableColumn<Furniture,Short> elLvlCol = new TableColumn<>("Electricity Level");
            elLvlCol.setCellValueFactory(new PropertyValueFactory<>("electricityLevel"));

            TableColumn<Furniture,Status> statusCol = new TableColumn<>("Status");
            statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

            TableColumn<Furniture,String> inclusionCol = new TableColumn<>("Inclusion");
            inclusionCol.setCellValueFactory(new PropertyValueFactory<>("Inclusion"));

            TableColumn<Furniture,Integer> temperatureCol = new TableColumn<>("Temperature");
            temperatureCol.setCellValueFactory(new PropertyValueFactory<>("Temperature"));

            TableColumn<Furniture, Date> timeCol = new TableColumn<>("Time");
            timeCol.setCellValueFactory(new PropertyValueFactory<>("time"));

            TableColumn<Furniture, Double> timerCol = new TableColumn<>("Alarm");
            timerCol.setCellValueFactory(new PropertyValueFactory<>("Progress"));
            timerCol.setCellFactory(ProgressBarTableCell.forTableColumn());












            tableView.getColumns().addAll(elLvlCol,statusCol,inclusionCol,temperatureCol,timeCol, timerCol);



            tableView.setItems(obList);
            ExecutorService executor = Executors.newFixedThreadPool(tableView.getItems().size(), new ThreadFactory() {
                @Override
                public Thread newThread(Runnable r) {
                    Thread t = new Thread(r);
                    t.setDaemon(true);
                    return t;
                }
            });

            for (Furniture task : tableView.getItems()) {
                executor.execute(task);
            }
            StackPane root = new StackPane();

            root.setPadding(new Insets(5));
            root.getChildren().add(tableView);

            primaryStage.setTitle("House stats");

            Scene scene = new Scene(root, 450, 300);
            primaryStage.setScene(scene);
            primaryStage.show();


              tableView.refresh();


        }

        public static void main(String[] args){
            launch(args);
        }
    }