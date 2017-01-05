package Sodoku;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;

/**
 * Created by Jensen on 1/4/17.
 */
public class InputUpdate {

    private TextField box1;

    public InputUpdate(TextField box) {

        box1 = box;

    }



    public  void change() {
        box1.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    box1.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.length() > 1) {
                    box1.setText(oldValue);
                }
            }
        });
    }
}
