package Sudoku;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by Jensen on 10/14/16.
 */
public class Windows {


    //opens the speicified menu item
    public void openAndCloseWindow(String window, String name, ActionEvent actionEvent) {

//        if(!window.equals("Settings") || !window.equals("MainMenu")) {
//            throw new IllegalArgumentException("That window name does not exist!");
//        }

        openWindow(window, name);
        closeWindow(actionEvent);
    }

    public void closeWindow(ActionEvent actionEvent) {
        Node source = (Node)  actionEvent.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        stage.close();
    }

    public void openWindow(String window, String name) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource( window + ".fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.setTitle(name);
            stage.show();
            System.out.println("[Log]: " + window + " Window Opened");
        } catch(Exception e) {
            System.out.println("[Log]: " + window + " Window failed to open");
            e.printStackTrace();
        }
    }

    public void openWindow(String window, String name, boolean isWindowChild) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource( window + ".fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.setTitle(name);
            if(isWindowChild) {
                stage.initModality(Modality.WINDOW_MODAL);
                stage.initOwner(Main.primaryStage);
            }
            stage.show();

            System.out.println("[Log]: " + window + " Window Opened");
        } catch(Exception e) {
            System.out.println("[Log]: " + window + " Window failed to open");
            e.printStackTrace();
        }
    }
}
