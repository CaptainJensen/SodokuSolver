package Tests;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Main extends Application {

    private static boolean wPressed = false;
    public static boolean isWPressed() {
        synchronized (Controller.class) {
            return wPressed;
        }
    }



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MenuWindow.fxml"));
        primaryStage.setTitle("Sudoku Solver");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {


            @Override
            public boolean dispatchKeyEvent(KeyEvent ke) {
                System.out.println("W Key Pressed");
                synchronized (Controller.class) {
                    switch (ke.getID()) {
                        case KeyEvent.KEY_PRESSED:
                            if (ke.getKeyCode() == KeyEvent.VK_W) {
                                System.out.println("W Key Pressed");
                                wPressed = true;
                            }
                            break;

                        case KeyEvent.KEY_RELEASED:
                            if (ke.getKeyCode() == KeyEvent.VK_W) {
                                wPressed = false;
                            }
                            break;
                    }
                    return false;
                }
            }
        });





        launch(args);
    }


    @Override
    public void stop() {
        System.out.println("Stage is closing");
//        try {
//            GlobalScreen.unregisterNativeHook();
//            System.out.println("Unregistered Native Hook");
//        } catch (NativeHookException e) {
//            e.printStackTrace();
//        }
    }

}

