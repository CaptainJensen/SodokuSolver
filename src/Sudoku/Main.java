package Sudoku;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    public static Stage primaryStage;


    @Override
    public void start(Stage primaryStage) throws Exception{
        Main.primaryStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("StyleSheets/MenuWindow.fxml"));
        primaryStage.setTitle("Sudoku Solver");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void init() {
        System.out.println("[log]: Init");
    }

    @Override
    public void stop() {
        System.out.println("[Log]: Stage is closing");

    }

}

