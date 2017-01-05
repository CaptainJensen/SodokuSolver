package Sodoku;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    public GridPane gridPane;
    public Button solveButton;

    public TextField SevenTwo;
    public TextField OneZero;
    public TextField TwoZero;
    public TextField EightZero;
    public TextField ZeroZero;
    public TextField EightEight;
    public TextField SevenEight;
    public TextField EightSeven;
    public TextField EightSix;
    public TextField SevenSix;
    public TextField SixSix;
    public TextField EightFive;
    public TextField SixSeven;
    public TextField SixEight;
    public TextField SevenSeven;
    public TextField SevenFive;
    public TextField EightFour;
    public TextField EightThree;
    public TextField EightTwo;
    public TextField FiveEight;
    public TextField FiveSeven;
    public TextField SevenFour;
    public TextField SevenThree;
    public TextField FourEight;
    public TextField FourSeven;
    public TextField FourSix;
    public TextField EightOne;
    public TextField FiveFive;
    public TextField FiveSix;
    public TextField SixFive;
    public TextField FourFive;
    public TextField SixThree;
    public TextField ThreeEight;
    public TextField ThreeSeven;
    public TextField FiveThree;
    public TextField FourFour;
    public TextField FiveFour;
    public TextField SixFour;
    public TextField FourThree;
    public TextField SixZero;
    public TextField SevenZero;
    public TextField FourTwo;
    public TextField SevenOne;
    public TextField SixOne;
    public TextField FiveTwo;
    public TextField SixTwo;
    public TextField FiveZero;
    public TextField FiveOne;
    public TextField FourZero;
    public TextField FourOne;
    public TextField ThreeFour;
    public TextField ThreeFive;
    public TextField ThreeSix;
    public TextField TwoEight;
    public TextField ZeroEight;
    public TextField OneEight;
    public TextField TwoSeven;
    public TextField OneSeven;
    public TextField ThreeZero;
    public TextField ThreeOne;
    public TextField ThreeTwo;
    public TextField ThreeThree;
    public TextField ZeroSeven;
    public TextField TwoFive;
    public TextField ZeroSix;
    public TextField OneSix;
    public TextField TwoSix;
    public TextField OneFive;
    public TextField TwoFour;
    public TextField ZeroFive;
    public TextField TwoThree;
    public TextField OneThree;
    public TextField ZeroFour;
    public TextField OneFour;
    public TextField ZeroThree;
    public TextField TwoTwo;
    public TextField OneOne;
    public TextField TwoOne;
    public TextField ZeroTwo;
    public TextField OneTwo;
    public TextField ZeroOne;



    private TextField[][] puzzleBoxes = new TextField[9][9];
    private int[][] puzzle = new int[9][9];




    public void solveAction(ActionEvent actionEvent) {

        //TODO: Create a check if possible method

        SudokuSolver solver = new SudokuSolver(puzzle);
        solver.solve(0,0);
        puzzle = solver.getNumbers();
        setBoardValues();
    }

    //sets values in the board
    private void setBoardValues() {
        for (int r = 0; r < puzzle.length; r++) {
            for (int c = 0; c < puzzle[r].length; c++) {
                puzzleBoxes[r][c].setText(String.valueOf(puzzle[r][c]));
            }
        }
    }

    //clears the board
    public void ClearBoard(ActionEvent actionEvent) {
        for (int r = 0; r < puzzleBoxes.length; r++) {
            for (int c = 0; c < puzzleBoxes[r].length; c++) {
                puzzleBoxes[r][c].setText(" ");
                puzzle[r][c] = 0;
            }
        }


    }


    /**
     * Called to initialize a controller after its root element has been
     * completely processed.
     *
     * @param location  The location used to resolve relative paths for the root object, or
     *                  <tt>null</tt> if the location is not known.
     * @param resources The resources used to localize the root object, or <tt>null</tt> if
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        puzzleBoxes[0][0] = ZeroZero;
        puzzleBoxes[0][1] = ZeroOne;
        puzzleBoxes[0][2] = ZeroTwo ;
        puzzleBoxes[0][3] = ZeroThree ;
        puzzleBoxes[0][4] = ZeroFour ;
        puzzleBoxes[0][5] = ZeroFive ;
        puzzleBoxes[0][6] = ZeroSix ;
        puzzleBoxes[0][7] = ZeroSeven ;
        puzzleBoxes[0][8] = ZeroEight ;
        puzzleBoxes[1][0] = OneZero ;
        puzzleBoxes[1][1] = OneOne ;
        puzzleBoxes[1][2] = OneTwo ;
        puzzleBoxes[1][3] = OneThree ;
        puzzleBoxes[1][4] = OneFour ;
        puzzleBoxes[1][5] = OneFive ;
        puzzleBoxes[1][6] = OneSix ;
        puzzleBoxes[1][7] = OneSeven ;
        puzzleBoxes[1][8] = OneEight ;
        puzzleBoxes[2][0] = TwoZero ;
        puzzleBoxes[2][1] = TwoOne ;
        puzzleBoxes[2][2] = TwoTwo ;
        puzzleBoxes[2][3] = TwoThree ;
        puzzleBoxes[2][4] = TwoFour ;
        puzzleBoxes[2][5] = TwoFive ;
        puzzleBoxes[2][6] = TwoSix ;
        puzzleBoxes[2][7] = TwoSeven ;
        puzzleBoxes[2][8] = TwoEight ;
        puzzleBoxes[3][0] = ThreeZero ;
        puzzleBoxes[3][1] = ThreeOne ;
        puzzleBoxes[3][2] = ThreeTwo ;
        puzzleBoxes[3][3] = ThreeThree ;
        puzzleBoxes[3][4] = ThreeFour ;
        puzzleBoxes[3][5] = ThreeFive ;
        puzzleBoxes[3][6] = ThreeSix ;
        puzzleBoxes[3][7] = ThreeSeven ;
        puzzleBoxes[3][8] = ThreeEight ;
        puzzleBoxes[4][0] = FourZero ;
        puzzleBoxes[4][1] = FourOne ;
        puzzleBoxes[4][2] = FourTwo ;
        puzzleBoxes[4][3] = FourThree ;
        puzzleBoxes[4][4] = FourFour ;
        puzzleBoxes[4][5] = FourFive ;
        puzzleBoxes[4][6] = FourSix ;
        puzzleBoxes[4][7] = FourSeven ;
        puzzleBoxes[4][8] = FourEight ;
        puzzleBoxes[5][0] = FiveZero ;
        puzzleBoxes[5][1] = FiveOne;
        puzzleBoxes[5][2] = FiveTwo ;
        puzzleBoxes[5][3] = FiveThree ;
        puzzleBoxes[5][4] = FiveFour ;
        puzzleBoxes[5][5] = FiveFive ;
        puzzleBoxes[5][6] = FiveSix ;
        puzzleBoxes[5][7] = FiveSeven ;
        puzzleBoxes[5][8] = FiveEight ;
        puzzleBoxes[6][0] = SixZero ;
        puzzleBoxes[6][1] = SixOne ;
        puzzleBoxes[6][2] = SixTwo ;
        puzzleBoxes[6][3] = SixThree ;
        puzzleBoxes[6][4] = SixFour ;
        puzzleBoxes[6][5] = SixFive ;
        puzzleBoxes[6][6] = SixSix ;
        puzzleBoxes[6][7] = SixSeven ;
        puzzleBoxes[6][8] = SixEight ;
        puzzleBoxes[7][0] = SevenZero ;
        puzzleBoxes[7][1] = SevenOne ;
        puzzleBoxes[7][2] = SevenTwo ;
        puzzleBoxes[7][3] = SevenThree ;
        puzzleBoxes[7][4] = SevenFour ;
        puzzleBoxes[7][5] = SevenFive ;
        puzzleBoxes[7][6] = SevenSix ;
        puzzleBoxes[7][7] = SevenSeven ;
        puzzleBoxes[7][8] = SevenEight ;
        puzzleBoxes[8][0] = EightZero ;
        puzzleBoxes[8][1] = EightOne ;
        puzzleBoxes[8][2] = EightTwo ;
        puzzleBoxes[8][3] = EightThree ;
        puzzleBoxes[8][4] = EightFour ;
        puzzleBoxes[8][5] = EightFive ;
        puzzleBoxes[8][6] = EightSix ;
        puzzleBoxes[8][7] = EightSeven ;
        puzzleBoxes[8][8] = EightEight ;

//                {{ ZeroZero, OneZero, TwoZero, ThreeZero, FourZero, FiveZero, SixZero, SevenZero, EightZero} ,
//            {ZeroOne, OneOne, TwoOne, ThreeOne, FourOne, FiveOne, SixOne, SevenOne, EightOne},
//            {ZeroTwo, OneTwo, TwoTwo, ThreeTwo, FourTwo, FiveTwo, SixTwo, SevenTwo, EightTwo},
//            {ZeroThree, OneThree , TwoThree, ThreeThree, FourThree, FiveThree, SixThree, SevenThree, EightThree },
//            {ZeroFour, OneFour , TwoFour, ThreeFour, FourFour, FiveFour, SixFour, SevenFour, EightFour },
//            {ZeroFive, OneFive , TwoFive, ThreeFive, FourFive, FiveFive, SixFive, SevenFive, EightFive },
//            {ZeroSix, OneSix , TwoSix, ThreeSix, FourSix, FiveSix, SixSix, SevenSix, EightSix },
//            {ZeroSeven, OneSeven , TwoSeven, ThreeSeven, FourSeven, FiveSeven, SixSeven, SevenSeven, EightSeven },
//            {ZeroEight, OneEight , TwoEight, ThreeEight, FourEight, FiveEight, SixEight, SevenEight, EightEight } };




        // force the field to be numeric only && only have one value
        ZeroZero.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    ZeroZero.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    ZeroZero.setText(oldValue);
                }
                else {
                    puzzle[0][0] = Integer.parseInt(ZeroZero.getText());
                    System.out.println(puzzle[0][0]);
                }
            }
        });

        ZeroOne.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    ZeroOne.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    ZeroOne.setText(oldValue);
                }
                else {
                    puzzle[0][1] = Integer.parseInt(ZeroOne.getText());
                    System.out.println(puzzle[0][1]);
                }
            }
        });

        ZeroTwo.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    ZeroTwo.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    ZeroTwo.setText(oldValue);
                }
                else {
                    puzzle[0][2] = Integer.parseInt(ZeroTwo.getText());
                    System.out.println(puzzle[0][2]);
                }
            }
        });

        ZeroThree.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    ZeroThree.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    ZeroThree.setText(oldValue);
                }
                else {
                    puzzle[0][3] = Integer.parseInt(ZeroThree.getText());
                    System.out.println(puzzle[0][3]);
                }
            }
        });

        ZeroFour.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    ZeroFour.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    ZeroFour.setText(oldValue);
                }
                else {
                    puzzle[0][4] = Integer.parseInt(ZeroFour.getText());
                    System.out.println(puzzle[0][4]);
                }
            }
        });

        ZeroFive.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    ZeroFive.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    ZeroFive.setText(oldValue);
                }
                else {
                    puzzle[0][5] = Integer.parseInt(ZeroFive.getText());
                    System.out.println(puzzle[0][5]);
                }
            }
        });

        ZeroSix.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    ZeroSix.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    ZeroSix.setText(oldValue);
                }
                else {
                    puzzle[0][6] = Integer.parseInt(ZeroSix.getText());
                    System.out.println(puzzle[0][6]);
                }
            }
        });

        ZeroSeven.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    ZeroSeven.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    ZeroSeven.setText(oldValue);
                }
                else {
                    puzzle[0][7] = Integer.parseInt(ZeroSeven.getText());
                    System.out.println(puzzle[0][7]);
                }
            }
        });

        ZeroEight.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    ZeroEight.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    ZeroEight.setText(oldValue);
                }
                else {
                    puzzle[0][8] = Integer.parseInt(ZeroEight.getText());
                    System.out.println(puzzle[0][8]);
                }
            }
        });

        OneZero.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    OneZero.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    OneZero.setText(oldValue);
                }
                else {
                    puzzle[1][0] = Integer.parseInt(OneZero.getText());
                    System.out.println(puzzle[1][0]);
                }
            }
        });

        OneOne.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    OneOne.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    OneOne.setText(oldValue);
                }
                else {
                    puzzle[1][1] = Integer.parseInt(OneOne.getText());
                    System.out.println(puzzle[1][1]);
                }
            }
        });

        OneTwo.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    OneTwo.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    OneTwo.setText(oldValue);
                }
                else {
                    puzzle[1][2] = Integer.parseInt(OneTwo.getText());
                    System.out.println(puzzle[1][2]);
                }
            }
        });

        OneThree.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    OneThree.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    OneThree.setText(oldValue);
                }
                else {
                    puzzle[1][3] = Integer.parseInt(OneThree.getText());
                    System.out.println(puzzle[1][3]);
                }
            }
        });

        OneFour.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    OneFour.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    OneFour.setText(oldValue);
                }
                else {
                    puzzle[1][4] = Integer.parseInt(OneFour.getText());
                    System.out.println(puzzle[1][4]);
                }
            }
        });

        OneFive.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    OneFive.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    OneFive.setText(oldValue);
                }
                else {
                    puzzle[1][5] = Integer.parseInt(OneFive.getText());
                    System.out.println(puzzle[1][5]);
                }
            }
        });

        OneSix.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    OneSix.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    OneSix.setText(oldValue);
                }
                else {
                    puzzle[1][6] = Integer.parseInt(OneSix.getText());
                    System.out.println(puzzle[1][6]);
                }
            }
        });

        OneSeven.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    OneSeven.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    OneSeven.setText(oldValue);
                }
                else {
                    puzzle[1][7] = Integer.parseInt(OneSeven.getText());
                    System.out.println(puzzle[1][7]);
                }
            }
        });

        OneEight.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    OneEight.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    OneEight.setText(oldValue);
                }
                else {
                    puzzle[1][8] = Integer.parseInt(OneEight.getText());
                    System.out.println(puzzle[1][8]);
                }
            }
        });

        TwoZero.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    TwoZero.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    TwoZero.setText(oldValue);
                }
                else {
                    puzzle[2][0] = Integer.parseInt(TwoZero.getText());
                    System.out.println(puzzle[2][0]);
                }
            }
        });

        TwoOne.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    TwoOne.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    TwoOne.setText(oldValue);
                }
                else {
                    puzzle[2][1] = Integer.parseInt(TwoOne.getText());
                    System.out.println(puzzle[2][1]);
                }
            }
        });

        TwoTwo.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    TwoTwo.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    TwoTwo.setText(oldValue);
                }
                else {
                    puzzle[2][2] = Integer.parseInt(TwoTwo.getText());
                    System.out.println(puzzle[2][2]);
                }
            }
        });

        TwoThree.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    TwoThree.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    TwoThree.setText(oldValue);
                }
                else {
                    puzzle[2][3] = Integer.parseInt(TwoThree.getText());
                    System.out.println(puzzle[2][3]);
                }
            }
        });

        TwoFour.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    TwoFour.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    TwoFour.setText(oldValue);
                }
                else {
                    puzzle[2][4] = Integer.parseInt(TwoFour.getText());
                    System.out.println(puzzle[2][4]);
                }
            }
        });

        TwoFive.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    TwoFive.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    TwoFive.setText(oldValue);
                }
                else {
                    puzzle[2][5] = Integer.parseInt(TwoFive.getText());
                    System.out.println(puzzle[2][5]);
                }
            }
        });

        TwoSix.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    TwoSix.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    TwoSix.setText(oldValue);
                }
                else {
                    puzzle[2][6] = Integer.parseInt(TwoSix.getText());
                    System.out.println(puzzle[2][6]);
                }
            }
        });

        TwoSeven.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    TwoSeven.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    TwoSeven.setText(oldValue);
                }
                else {
                    puzzle[2][7] = Integer.parseInt(TwoSeven.getText());
                    System.out.println(puzzle[2][7]);
                }
            }
        });

        TwoEight.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    TwoEight.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    TwoEight.setText(oldValue);
                }
                else {
                    puzzle[2][8] = Integer.parseInt(TwoEight.getText());
                    System.out.println(puzzle[2][8]);
                }
            }
        });

        ThreeZero.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    ThreeZero.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    ThreeZero.setText(oldValue);
                }
                else {
                    puzzle[3][0] = Integer.parseInt(ThreeZero.getText());
                    System.out.println(puzzle[3][0]);
                }
            }
        });

        ThreeOne.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    ThreeOne.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    ThreeOne.setText(oldValue);
                }
                else {
                    puzzle[3][1] = Integer.parseInt(ThreeOne.getText());
                    System.out.println(puzzle[3][1]);
                }
            }
        });

        ThreeTwo.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    ThreeTwo.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    ThreeTwo.setText(oldValue);
                }
                else {
                    puzzle[3][2] = Integer.parseInt(ThreeTwo.getText());
                    System.out.println(puzzle[3][2]);
                }
            }
        });

        ThreeThree.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    ThreeThree.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    ThreeThree.setText(oldValue);
                }
                else {
                    puzzle[3][3] = Integer.parseInt(ThreeThree.getText());
                    System.out.println(puzzle[3][3]);
                }
            }
        });

        ThreeFour.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    ThreeFour.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    ThreeFour.setText(oldValue);
                }
                else {
                    puzzle[3][4] = Integer.parseInt(ThreeFour.getText());
                    System.out.println(puzzle[3][4]);
                }
            }
        });

        ThreeFive.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    ThreeFive.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    ThreeFive.setText(oldValue);
                }
                else {
                    puzzle[3][5] = Integer.parseInt(ThreeFive.getText());
                    System.out.println(puzzle[3][5]);
                }
            }
        });

        ThreeSix.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    ThreeSix.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    ThreeSix.setText(oldValue);
                }
                else {
                    puzzle[3][6] = Integer.parseInt(ThreeSix.getText());
                    System.out.println(puzzle[3][6]);
                }
            }
        });

        ThreeSeven.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    ThreeSeven.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    ThreeSeven.setText(oldValue);
                }
                else {
                    puzzle[3][7] = Integer.parseInt(ThreeSeven.getText());
                    System.out.println(puzzle[3][7]);
                }
            }
        });

        ThreeEight.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    ThreeEight.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    ThreeEight.setText(oldValue);
                }
                else {
                    puzzle[3][8] = Integer.parseInt(ThreeEight.getText());
                    System.out.println(puzzle[3][8]);
                }
            }
        });

        FourZero.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    FourZero.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    FourZero.setText(oldValue);
                }
                else {
                    puzzle[4][0] = Integer.parseInt(FourZero.getText());
                    System.out.println(puzzle[4][0]);
                }
            }
        });

        FourOne.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    FourOne.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    FourOne.setText(oldValue);
                }
                else {
                    puzzle[4][1] = Integer.parseInt(FourOne.getText());
                    System.out.println(puzzle[4][1]);
                }
            }
        });

        FourTwo.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    FourTwo.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    FourTwo.setText(oldValue);
                }
                else {
                    puzzle[4][2] = Integer.parseInt(FourTwo.getText());
                    System.out.println(puzzle[4][2]);
                }
            }
        });

        FourThree.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    FourThree.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    FourThree.setText(oldValue);
                }
                else {
                    puzzle[4][3] = Integer.parseInt(FourThree.getText());
                    System.out.println(puzzle[4][3]);
                }
            }
        });

        FourFour.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    FourFour.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    FourFour.setText(oldValue);
                }
                else {
                    puzzle[4][4] = Integer.parseInt(FourFour.getText());
                    System.out.println(puzzle[4][4]);
                }
            }
        });

        FourFive.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    FourFive.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    FourFive.setText(oldValue);
                }
                else {
                    puzzle[4][5] = Integer.parseInt(FourFive.getText());
                    System.out.println(puzzle[4][5]);
                }
            }
        });

        FourSix.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    FourSix.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    FourSix.setText(oldValue);
                }
                else {
                    puzzle[4][6] = Integer.parseInt(FourSix.getText());
                    System.out.println(puzzle[4][6]);
                }
            }
        });

        FourSeven.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    FourSeven.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    FourSeven.setText(oldValue);
                }
                else {
                    puzzle[4][7] = Integer.parseInt(FourSeven.getText());
                    System.out.println(puzzle[4][7]);
                }
            }
        });

        FourEight.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    FourEight.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    FourEight.setText(oldValue);
                }
                else {
                    puzzle[4][8] = Integer.parseInt(FourEight.getText());
                    System.out.println(puzzle[4][8]);
                }
            }
        });

        FiveEight.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    FiveEight.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    FiveEight.setText(oldValue);
                }
                else {
                    puzzle[5][8] = Integer.parseInt(FiveEight.getText());
                    System.out.println(puzzle[5][8]);
                }
            }
        });

        FiveZero.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    FiveZero.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    FiveZero.setText(oldValue);
                }
                else {
                    puzzle[5][0] = Integer.parseInt(FiveZero.getText());
                    System.out.println(puzzle[5][0]);
                }
            }
        });

        FiveOne.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    FiveOne.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    FiveOne.setText(oldValue);
                }
                else {
                    puzzle[5][1] = Integer.parseInt(FiveOne.getText());
                    System.out.println(puzzle[5][1]);
                }
            }
        });

        FiveTwo.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    FiveTwo.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    FiveTwo.setText(oldValue);
                }
                else {
                    puzzle[5][2] = Integer.parseInt(FiveTwo.getText());
                    System.out.println(puzzle[5][2]);
                }
            }
        });

        FiveThree.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    FiveThree.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    FiveThree.setText(oldValue);
                }
                else {
                    puzzle[5][3] = Integer.parseInt(FiveThree.getText());
                    System.out.println(puzzle[5][3]);
                }
            }
        });

        FiveFour.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    FiveFour.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    FiveFour.setText(oldValue);
                }
                else {
                    puzzle[5][4] = Integer.parseInt(FiveFour.getText());
                    System.out.println(puzzle[5][4]);
                }
            }
        });

        FiveFive.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    FiveFive.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    FiveFive.setText(oldValue);
                }
                else {
                    puzzle[5][5] = Integer.parseInt(FiveFive.getText());
                    System.out.println(puzzle[5][5]);
                }
            }
        });

        FiveSix.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    FiveSix.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    FiveSix.setText(oldValue);
                }
                else {
                    puzzle[5][6] = Integer.parseInt(FiveSix.getText());
                    System.out.println(puzzle[5][6]);
                }
            }
        });

        FiveSeven.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    FiveSeven.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    FiveSeven.setText(oldValue);
                }
                else {
                    puzzle[5][7] = Integer.parseInt(FiveSeven.getText());
                    System.out.println(puzzle[5][7]);
                }
            }
        });

        SixZero.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    SixZero.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    SixZero.setText(oldValue);
                }
                else {
                    puzzle[6][0] = Integer.parseInt(SixZero.getText());
                    System.out.println(puzzle[6][0]);
                }
            }
        });

        SixOne.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    SixOne.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    SixOne.setText(oldValue);
                }
                else {
                    puzzle[6][1] = Integer.parseInt(SixOne.getText());
                    System.out.println(puzzle[6][1]);
                }
            }
        });

        SixTwo.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    SixTwo.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    SixTwo.setText(oldValue);
                }
                else {
                    puzzle[6][2] = Integer.parseInt(SixTwo.getText());
                    System.out.println(puzzle[6][2]);
                }
            }
        });

        SixThree.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    SixThree.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    SixThree.setText(oldValue);
                }
                else {
                    puzzle[6][3] = Integer.parseInt(SixThree.getText());
                    System.out.println(puzzle[6][3]);
                }
            }
        });

        SixFour.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    SixFour.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    SixFour.setText(oldValue);
                }
                else {
                    puzzle[6][4] = Integer.parseInt(SixFour.getText());
                    System.out.println(puzzle[6][4]);
                }
            }
        });

        SixFive.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    SixFive.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    SixFive.setText(oldValue);
                }
                else {
                    puzzle[6][5] = Integer.parseInt(SixFive.getText());
                    System.out.println(puzzle[6][5]);
                }
            }
        });

        SixSix.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    SixSix.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    SixSix.setText(oldValue);
                }
                else {
                    puzzle[6][6] = Integer.parseInt(SixSix.getText());
                    System.out.println(puzzle[6][6]);
                }
            }
        });

        SixSeven.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    SixSeven.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    SixSeven.setText(oldValue);
                }
                else {
                    puzzle[6][7] = Integer.parseInt(SixSeven.getText());
                    System.out.println(puzzle[6][7]);
                }
            }
        });

        SixEight.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    SixEight.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    SixEight.setText(oldValue);
                }
                else {
                    puzzle[6][8] = Integer.parseInt(SixEight.getText());
                    System.out.println(puzzle[6][8]);
                }
            }
        });

        SevenZero.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    SevenZero.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    SevenZero.setText(oldValue);
                }
                else {
                    puzzle[7][0] = Integer.parseInt(SevenZero.getText());
                    System.out.println(puzzle[7][0]);
                }
            }
        });

        SevenOne.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    SevenOne.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    SevenOne.setText(oldValue);
                }
                else {
                    puzzle[7][1] = Integer.parseInt(SevenOne.getText());
                    System.out.println(puzzle[7][1]);
                }
            }
        });

        SevenTwo.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    SevenTwo.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    SevenTwo.setText(oldValue);
                }
                else {
                    puzzle[7][2] = Integer.parseInt(SevenTwo.getText());
                    System.out.println(puzzle[7][2]);
                }
            }
        });

        SevenThree.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    SevenThree.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    SevenThree.setText(oldValue);
                }
                else {
                    puzzle[7][3] = Integer.parseInt(SevenThree.getText());
                    System.out.println(puzzle[7][3]);
                }
            }
        });

        SevenFour.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    SevenFour.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    SevenFour.setText(oldValue);
                }
                else {
                    puzzle[7][4] = Integer.parseInt(SevenFour.getText());
                    System.out.println(puzzle[7][4]);
                }
            }
        });

        SevenFive.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    SevenFive.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    SevenFive.setText(oldValue);
                }
                else {
                    puzzle[7][5] = Integer.parseInt(SevenFive.getText());
                    System.out.println(puzzle[7][5]);
                }
            }
        });

        SevenSix.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    SevenSix.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    SevenSix.setText(oldValue);
                }
                else {
                    puzzle[7][6] = Integer.parseInt(SevenSix.getText());
                    System.out.println(puzzle[7][6]);
                }
            }
        });

        SevenSeven.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    SevenSeven.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    SevenSeven.setText(oldValue);
                }
                else {
                    puzzle[7][7] = Integer.parseInt(SevenSeven.getText());
                    System.out.println(puzzle[7][7]);
                }
            }
        });

        SevenEight.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    SevenEight.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    SevenEight.setText(oldValue);
                }
                else {
                    puzzle[7][8] = Integer.parseInt(SevenEight.getText());
                    System.out.println(puzzle[7][8]);
                }
            }
        });

        EightZero.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    EightZero.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    EightZero.setText(oldValue);
                }
                else {
                    puzzle[8][0] = Integer.parseInt(EightZero.getText());
                    System.out.println(puzzle[8][0]);
                }
            }
        });

        EightOne.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    EightOne.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    EightOne.setText(oldValue);
                }
                else {
                    puzzle[8][1] = Integer.parseInt(EightOne.getText());
                    System.out.println(puzzle[8][1]);
                }
            }
        });

        EightTwo.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    EightTwo.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    EightTwo.setText(oldValue);
                }
                else {
                    puzzle[8][2] = Integer.parseInt(EightTwo.getText());
                    System.out.println(puzzle[8][2]);
                }
            }
        });

        EightThree.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    EightThree.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    EightThree.setText(oldValue);
                }
                else {
                    puzzle[8][3] = Integer.parseInt(EightThree.getText());
                    System.out.println(puzzle[8][3]);
                }
            }
        });

        EightFour.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    EightFour.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    EightFour.setText(oldValue);
                }
                else {
                    puzzle[8][4] = Integer.parseInt(EightFour.getText());
                    System.out.println(puzzle[8][4]);
                }
            }
        });

        EightFive.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    EightFive.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    EightFive.setText(oldValue);
                }
                else {
                    puzzle[8][5] = Integer.parseInt(EightFive.getText());
                    System.out.println(puzzle[8][5]);
                }
            }
        });

        EightSix.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    EightSix.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    EightSix.setText(oldValue);
                }
                else {
                    puzzle[8][6] = Integer.parseInt(EightSix.getText());
                    System.out.println(puzzle[8][6]);
                }
            }
        });

        EightSeven.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    EightSeven.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    EightSeven.setText(oldValue);
                }
                else {
                    puzzle[8][7] = Integer.parseInt(EightSeven.getText());
                    System.out.println(puzzle[8][7]);
                }
            }
        });

        EightEight.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    EightEight.setText(newValue.replaceAll("[^\\d]", ""));
                }
                else if(newValue.equals("")) {
                    System.out.println("Empty");
                }
                else if(newValue.length() > 1 || Integer.parseInt(newValue) == 0 || Integer.parseInt(newValue) > 9) {
                    EightEight.setText(oldValue);
                }
                else {
                    puzzle[8][8] = Integer.parseInt(EightEight.getText());
                    System.out.println(puzzle[8][8]);
                }
            }
        });

    }






    

}
