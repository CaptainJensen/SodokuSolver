package Tests;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.awt.event.KeyAdapter;

/**
 * Created by Jensen on 1/7/17.
 */
class MyKeyListener extends KeyAdapter {




    public void keyPressed(KeyEvent evt) {
        if (evt.getCode() == KeyCode.DIGIT1) {
            System.out.println("Check for key characters: ");
        }
    }
}
