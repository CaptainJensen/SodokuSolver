package Sudoku;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;



public class Controller implements Initializable {

    private static TextField[][] puzzleBoxes = new TextField[9][9];
    private static int[][] puzzle;

    //MemoryUsage memoryUsage = new MemoryUsage();

    public GridPane gridPane;
    public Button solveButton;
    public MenuBar menuBar;
    public Text errorText;

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


    private void setNotPossibleValue(boolean value) {
        if(value) {
            solveButton.setDisable(true);
            errorText.setVisible(true);
        }
        else {
            solveButton.setDisable(false);
            errorText.setVisible(false);
        }
    }

    public void solveAction(ActionEvent actionEvent) {

        System.out.println("[Log]: Solve Button Pressed");

        BoardChecker boardChecker = new BoardChecker(puzzle);
        if (!boardChecker.isBoardPossible()) {
            System.out.println("[Puzzle]: Not Possible Value");
            puzzleBoxes[boardChecker.getErrorR()][boardChecker.getErrorC()].setStyle("-fx-background-color: RED;");
            //puzzleBoxes[boardChecker.getErrorR()][boardChecker.getErrorC()].requestFocus();
            //TODO: make text above show error
            setNotPossibleValue(true);

        } else {

            SudokuSolver solver = new SudokuSolver(puzzle);
            solver.showPuzzle();
            solver.solve(0,0);
            puzzle = solver.getNumbers();
            setBoardValues();
            //MemoryUsage.printMemoryUsage();
        }


    }

    //sets values in the board
    private void setBoardValues() {
        for (int r = 0; r < puzzle.length; r++) {
            for (int c = 0; c < puzzle[r].length; c++) {
                puzzleBoxes[r][c].setText(String.valueOf(puzzle[r][c]));
            }
        }
    }

    //clears the board from Button action
    public void ClearBoard(ActionEvent actionEvent) {
        System.out.println("[Log]: Board Reset From Button");
        setNotPossibleValue(false);
        ResetBoard();
    }

    //resets the board
    private void ResetBoard() {
        for (int r = 0; r < puzzleBoxes.length; r++) {
            for (int c = 0; c < puzzleBoxes[r].length; c++) {
                puzzleBoxes[r][c].setStyle("-fx-background-color: null;");
                puzzleBoxes[r][c].setText("");
                puzzle = new int[9][9];

            }
        }

        //TODO: also reset text to ""
    }

    //closes the window
    public void closeWindow(ActionEvent actionEvent) {
        Platform.exit();
    }


    /**
     * Puzzle Section
     */
    public void generateEasy(ActionEvent actionEvent) {
        ResetBoard();
        Generator generator = new Generator();
        generator.nextBoard(1);
        puzzle = generator.getBoard();
        setBoardValues();
    }

    public void generateInt(ActionEvent actionEvent) {
        ResetBoard();
        Generator generator = new Generator();
        generator.nextBoard(2);
        puzzle = generator.getBoard();
        setBoardValues();
    }

    public void generateHard(ActionEvent actionEvent) {
        ResetBoard();
        Generator generator = new Generator();
        generator.nextBoard(3);
        puzzle = generator.getBoard();
        setBoardValues();
    }



    /**
     * Help Section
     */
    public void openHelp(ActionEvent actionEvent) {

//        Windows windows = new Windows();
//        windows.openWindow("StyleSheets/SolverHelp", "Help" , true);

        //TODO: create help page
    }

    public void openAbout(ActionEvent actionEvent) {
        Windows windows = new Windows();
        windows.openWindow("StyleSheets/About", "About" , true);
    }



    /**
     * Preferences Section
     */
    public void darkToggleAction(ActionEvent actionEvent) {

        //TODO: add toggle

    }

    public void tealToggleAction(ActionEvent actionEvent) {

        //TODO: add toggle

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



        //Values Reversed from value name since FXML grid is labeled backwards
        puzzleBoxes[0][0] = ZeroZero;
        puzzleBoxes[1][0] = ZeroOne;
        puzzleBoxes[2][0] = ZeroTwo ;
        puzzleBoxes[3][0] = ZeroThree ;
        puzzleBoxes[4][0] = ZeroFour ;
        puzzleBoxes[5][0] = ZeroFive ;
        puzzleBoxes[6][0] = ZeroSix ;
        puzzleBoxes[7][0] = ZeroSeven ;
        puzzleBoxes[8][0] = ZeroEight ;
        puzzleBoxes[0][1] = OneZero ;
        puzzleBoxes[1][1] = OneOne ;
        puzzleBoxes[2][1] = OneTwo ;
        puzzleBoxes[3][1] = OneThree ;
        puzzleBoxes[4][1] = OneFour ;
        puzzleBoxes[5][1] = OneFive ;
        puzzleBoxes[6][1] = OneSix ;
        puzzleBoxes[7][1] = OneSeven ;
        puzzleBoxes[8][1] = OneEight ;
        puzzleBoxes[0][2] = TwoZero ;
        puzzleBoxes[1][2] = TwoOne ;
        puzzleBoxes[2][2] = TwoTwo ;
        puzzleBoxes[3][2] = TwoThree ;
        puzzleBoxes[4][2] = TwoFour ;
        puzzleBoxes[5][2] = TwoFive ;
        puzzleBoxes[6][2] = TwoSix ;
        puzzleBoxes[7][2] = TwoSeven ;
        puzzleBoxes[8][2] = TwoEight ;
        puzzleBoxes[0][3] = ThreeZero ;
        puzzleBoxes[1][3] = ThreeOne ;
        puzzleBoxes[2][3] = ThreeTwo ;
        puzzleBoxes[3][3] = ThreeThree ;
        puzzleBoxes[4][3] = ThreeFour ;
        puzzleBoxes[5][3] = ThreeFive ;
        puzzleBoxes[6][3] = ThreeSix ;
        puzzleBoxes[7][3] = ThreeSeven ;
        puzzleBoxes[8][3] = ThreeEight ;
        puzzleBoxes[0][4] = FourZero ;
        puzzleBoxes[1][4] = FourOne ;
        puzzleBoxes[2][4] = FourTwo ;
        puzzleBoxes[3][4] = FourThree ;
        puzzleBoxes[4][4] = FourFour ;
        puzzleBoxes[5][4] = FourFive ;
        puzzleBoxes[6][4] = FourSix ;
        puzzleBoxes[7][4] = FourSeven ;
        puzzleBoxes[8][4] = FourEight ;
        puzzleBoxes[0][5] = FiveZero ;
        puzzleBoxes[1][5] = FiveOne;
        puzzleBoxes[2][5] = FiveTwo ;
        puzzleBoxes[3][5] = FiveThree ;
        puzzleBoxes[4][5] = FiveFour ;
        puzzleBoxes[5][5] = FiveFive ;
        puzzleBoxes[6][5] = FiveSix ;
        puzzleBoxes[7][5] = FiveSeven ;
        puzzleBoxes[8][5] = FiveEight ;
        puzzleBoxes[0][6] = SixZero ;
        puzzleBoxes[1][6] = SixOne ;
        puzzleBoxes[2][6] = SixTwo ;
        puzzleBoxes[3][6] = SixThree ;
        puzzleBoxes[4][6] = SixFour ;
        puzzleBoxes[5][6] = SixFive ;
        puzzleBoxes[6][6] = SixSix ;
        puzzleBoxes[7][6] = SixSeven ;
        puzzleBoxes[8][6] = SixEight ;
        puzzleBoxes[0][7] = SevenZero ;
        puzzleBoxes[1][7] = SevenOne ;
        puzzleBoxes[2][7] = SevenTwo ;
        puzzleBoxes[3][7] = SevenThree ;
        puzzleBoxes[4][7] = SevenFour ;
        puzzleBoxes[5][7] = SevenFive ;
        puzzleBoxes[6][7] = SevenSix ;
        puzzleBoxes[7][7] = SevenSeven ;
        puzzleBoxes[8][7] = SevenEight ;
        puzzleBoxes[0][8] = EightZero ;
        puzzleBoxes[1][8] = EightOne ;
        puzzleBoxes[2][8] = EightTwo ;
        puzzleBoxes[3][8] = EightThree ;
        puzzleBoxes[4][8] = EightFour ;
        puzzleBoxes[5][8] = EightFive ;
        puzzleBoxes[6][8] = EightSix ;
        puzzleBoxes[7][8] = EightSeven ;
        puzzleBoxes[8][8] = EightEight ;

        ResetBoard();

        final String os = System.getProperty ("os.name");
        if (os != null && os.startsWith ("Mac")) {
           // menuBar.useSystemMenuBarProperty().set(true);
        }

        for (int i = 0; i < puzzleBoxes.length; i++) {
            for (int j = 0; j < puzzleBoxes[i].length; j++) {

                final int r = i;
                final int c = j;

                puzzleBoxes[i][j].textProperty().addListener(new ChangeListener<String>() {

                    @Override
                    public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {



                        System.out.println("[Puzzle]: Oldvalue: " + oldValue);
                        System.out.println("[Puzzle]: newValue: " + newValue);

                        if (!newValue.matches("\\d*")) {
                            //puzzleBoxes[r][c].textProperty().removeListener(this);
                            puzzleBoxes[r][c].setText(newValue.replaceAll("[^\\d]", ""));
                            //puzzleBoxes[r][c].textProperty().addListener(this);
                        }
                        else if (newValue.equals("")) {
                            puzzle[r][c] = 0;
                            System.out.println("[Puzzle]: Empty");
                            setNotPossibleValue(false);
                        }
                        else if (newValue.length() > 1 || Integer.parseInt(newValue) == 0) {
                            puzzleBoxes[r][c].textProperty().removeListener(this);
                            puzzleBoxes[r][c].setText(oldValue);
                            System.out.println("[Puzzle]: Text Greater than 1 or Zero");
                            puzzleBoxes[r][c].textProperty().addListener(this);
                        }
                        else {
                            puzzle[r][c] = Integer.parseInt(puzzleBoxes[r][c].getText());
                            //puzzleBoxes[r+1][c].requestFocus(); TODO: ADD THIS WITH FUCTIONALITY
                            System.out.println("[Puzzle]: Value added to Puzzle " + puzzle[r][c]);
                            SudokuSolver solver = new SudokuSolver(puzzle);
                            solver.showPuzzle();
                        }



                    }
                });

            }
        }



    }

}