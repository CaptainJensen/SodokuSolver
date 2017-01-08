package Tests;

import Sudoku.BoardChecker;
import Sudoku.SudokuSolver;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
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

    private static TextField[][] puzzleBoxes = new TextField[9][9];
    private static int[][] puzzle = new int[9][9];



    public void solveAction(ActionEvent actionEvent) {

        SudokuSolver solver = new SudokuSolver(puzzle);
        solver.solve(0,0);
        puzzle = solver.getNumbers();
        setBoardValues();
        reportMemoryUsage();
    }


    private static void reportMemoryUsage() {
        System.gc();
        Runtime runtime = Runtime.getRuntime();
        long used = runtime.totalMemory() - runtime.freeMemory();
        double mb = 1024*1024;
        System.out.printf("Used Memory after GC: %.2f MB", used / mb);
        System.out.println();
    }

    //sets values in the board
    private void setBoardValues() {
        for (int r = 0; r < puzzle.length; r++) {
            for (int c = 0; c < puzzle[r].length; c++) {
                puzzleBoxes[r][c].setText(String.valueOf(puzzle[r][c]));
            }
        }
    }

    //clears the board action
    public void ClearBoard(ActionEvent actionEvent) {
            ResetBoard();
    }


    //resets the board
    private void ResetBoard() {
        for (int r = 0; r < puzzleBoxes.length; r++) {
            for (int c = 0; c < puzzleBoxes[r].length; c++) {
                puzzleBoxes[r][c].setText("");
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
        puzzleBoxes[0][2] = ZeroTwo;
        puzzleBoxes[0][3] = ZeroThree;
        puzzleBoxes[0][4] = ZeroFour;
        puzzleBoxes[0][5] = ZeroFive;
        puzzleBoxes[0][6] = ZeroSix;
        puzzleBoxes[0][7] = ZeroSeven;
        puzzleBoxes[0][8] = ZeroEight;
        puzzleBoxes[1][0] = OneZero;
        puzzleBoxes[1][1] = OneOne;
        puzzleBoxes[1][2] = OneTwo;
        puzzleBoxes[1][3] = OneThree;
        puzzleBoxes[1][4] = OneFour;
        puzzleBoxes[1][5] = OneFive;
        puzzleBoxes[1][6] = OneSix;
        puzzleBoxes[1][7] = OneSeven;
        puzzleBoxes[1][8] = OneEight;
        puzzleBoxes[2][0] = TwoZero;
        puzzleBoxes[2][1] = TwoOne;
        puzzleBoxes[2][2] = TwoTwo;
        puzzleBoxes[2][3] = TwoThree;
        puzzleBoxes[2][4] = TwoFour;
        puzzleBoxes[2][5] = TwoFive;
        puzzleBoxes[2][6] = TwoSix;
        puzzleBoxes[2][7] = TwoSeven;
        puzzleBoxes[2][8] = TwoEight;
        puzzleBoxes[3][0] = ThreeZero;
        puzzleBoxes[3][1] = ThreeOne;
        puzzleBoxes[3][2] = ThreeTwo;
        puzzleBoxes[3][3] = ThreeThree;
        puzzleBoxes[3][4] = ThreeFour;
        puzzleBoxes[3][5] = ThreeFive;
        puzzleBoxes[3][6] = ThreeSix;
        puzzleBoxes[3][7] = ThreeSeven;
        puzzleBoxes[3][8] = ThreeEight;
        puzzleBoxes[4][0] = FourZero;
        puzzleBoxes[4][1] = FourOne;
        puzzleBoxes[4][2] = FourTwo;
        puzzleBoxes[4][3] = FourThree;
        puzzleBoxes[4][4] = FourFour;
        puzzleBoxes[4][5] = FourFive;
        puzzleBoxes[4][6] = FourSix;
        puzzleBoxes[4][7] = FourSeven;
        puzzleBoxes[4][8] = FourEight;
        puzzleBoxes[5][0] = FiveZero;
        puzzleBoxes[5][1] = FiveOne;
        puzzleBoxes[5][2] = FiveTwo;
        puzzleBoxes[5][3] = FiveThree;
        puzzleBoxes[5][4] = FiveFour;
        puzzleBoxes[5][5] = FiveFive;
        puzzleBoxes[5][6] = FiveSix;
        puzzleBoxes[5][7] = FiveSeven;
        puzzleBoxes[5][8] = FiveEight;
        puzzleBoxes[6][0] = SixZero;
        puzzleBoxes[6][1] = SixOne;
        puzzleBoxes[6][2] = SixTwo;
        puzzleBoxes[6][3] = SixThree;
        puzzleBoxes[6][4] = SixFour;
        puzzleBoxes[6][5] = SixFive;
        puzzleBoxes[6][6] = SixSix;
        puzzleBoxes[6][7] = SixSeven;
        puzzleBoxes[6][8] = SixEight;
        puzzleBoxes[7][0] = SevenZero;
        puzzleBoxes[7][1] = SevenOne;
        puzzleBoxes[7][2] = SevenTwo;
        puzzleBoxes[7][3] = SevenThree;
        puzzleBoxes[7][4] = SevenFour;
        puzzleBoxes[7][5] = SevenFive;
        puzzleBoxes[7][6] = SevenSix;
        puzzleBoxes[7][7] = SevenSeven;
        puzzleBoxes[7][8] = SevenEight;
        puzzleBoxes[8][0] = EightZero;
        puzzleBoxes[8][1] = EightOne;
        puzzleBoxes[8][2] = EightTwo;
        puzzleBoxes[8][3] = EightThree;
        puzzleBoxes[8][4] = EightFour;
        puzzleBoxes[8][5] = EightFive;
        puzzleBoxes[8][6] = EightSix;
        puzzleBoxes[8][7] = EightSeven;
        puzzleBoxes[8][8] = EightEight;

        ResetBoard();


//            for (int r = 0; r < puzzle.length; r++) {
//                for (int c = 0; c < puzzle[r].length; c++) {
//                        int finalR = r;
//                        int finalC = c;
//                        puzzleBoxes[r][c].textProperty().addListener((observable, oldValue, newValue) -> { //TODO: Fix double call in replacing text (could be with true and false)
//
//                                BoardChecker boardChecker = new BoardChecker(puzzle);
//
//                                if (!newValue.matches("\\d*")) {
//                                puzzleBoxes[r][c].setText(newValue.replaceAll("[^\\d]", ""));
//                                }
//                                else if (newValue.equals("")) {
//                                    System.out.println("Empty");
//                                }
//                                else if (newValue.length() > 1 || newValue.equals("0")) {
//                                    puzzleBoxes[finalR][finalC].setText(oldValue);
//                                    System.out.println("Call");
//                                }
//                                else if (!boardChecker.isPossibleDigit(Integer.parseInt(newValue), 0, 0)) {
//                                    System.out.println("Not Possible Value");
//                                    //TODO: MAKE NOT POSSIBLE VALUE RECONIGEABLE
//                                }
//                                else {
//                                    puzzle[finalR][finalC] = Integer.parseInt(puzzleBoxes[finalR][finalC].getText());
//                                    System.out.println("Number Saved: " + puzzle[finalR][finalC]);
//                                }
//                        });
//
//                        return; //stops searching when box is foun
//
//                }
//            }



        for (int i = 0; i < puzzleBoxes.length; i++) {
            for (int j = 0; j < puzzleBoxes[i].length; j++) {


                final int r = i;
                final int c = j;
                puzzleBoxes[i][j].textProperty().addListener(new ChangeListener<String>() {

                    @Override
                    public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {


                        BoardChecker boardChecker = new BoardChecker(puzzle);


                        if (!newValue.matches("\\d*")) {
                            puzzleBoxes[r][c].setText(newValue.replaceAll("[^\\d]", ""));
                        } else if (newValue.equals("")) {
                            System.out.println("Empty");
                        } else if (newValue.length() > 1 || Integer.parseInt(newValue) == 0) {
                            puzzleBoxes[r][c].setText(newValue.replace(newValue, oldValue));
                            System.out.println("Call");
                        } else if (!boardChecker.isPossibleDigit(Integer.parseInt(newValue), 0, 0)) {
                            System.out.println("Not Possible Value");
                        } else {
                            puzzle[r][c] = Integer.parseInt(puzzleBoxes[r][c].getText());
                            System.out.println(puzzle[r][c]);
                        }
                    }
                });


            }
        }


    }

}