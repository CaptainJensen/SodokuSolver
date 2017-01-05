package Sudoku;

/**
 * Created by Jensen on 1/4/17.
 */

public class SudokuSolver {




    private int[][] numbers;


    //constructor
    public SudokuSolver(int[][] values) {
        numbers = values;



//        numbers =  new int[9][9];
        //int[][] vals = new int[9][9];
//        Scanner read = new Scanner(new File(filePath));
//        for (int r = 0; r < numbers.length; r++) {
//            for (int c = 0; c < numbers[r].length; c++) {
//                numbers[r][c] = read.nextInt();
//            }
//        }

    }


    //shows the puzzle to consol
    public void showPuzzle() {

        for (int r = 0; r < numbers.length; r++) {
            for (int c = 0; c < numbers[r].length; c++) {
                System.out.print(numbers[r][c] + "\t");
            }
            System.out.println();
        }
    }


    //solvs the puzzle
    public boolean solve(int row, int col) {
        //checks to see if all cels are visited
        if(row == numbers.length) {
            row = 0;
            if (++col == numbers[row].length) {
                return true;
            }
        }
        //checks to see if valuse is not 0 then moves
        if (numbers[row][col] != 0) {
            return solve(row+1,col);
        }
        //places possible values
        for (int i = 0; i <= 9; i++) {
            if(isPossibleDigit(i,row,col)) {
                numbers[row][col] = i;
                if(solve(row+1,col)) {
                    return true;
                }
            }
        }
        numbers[row][col] = 0;
        return false;
    }

    //checks to see if value is possible in puzzle
    private boolean isPossibleDigit(int i, int row, int col) {
        return !isInRow(i,row) && !isInColumn(i,col) && !isInSquare(i,row,col);
    }

    //checks if value is allowed in square
    private boolean isInSquare(int k, int row, int col) {
        int[][] square = getSquare(row,col);
        return isInSquare(k,square);
    }


    //checks if value is allowed in quare?
    private boolean isInSquare(int k, int[][] square) {
        for (int r = 0; r < square.length; r++) {
            for (int c = 0; c < square[r].length; c++) {
                if (square[r][c] == k) return true;
            }
        }
        return false;
    }


    //used to get the square for in square
    private int[][] getSquare(int row, int col) {
        int[][] square = new int[3][3];

        int rowStart = (row/3)*3;
        int colStart = (col/3)*3;

        for (int r = rowStart; r < rowStart + 3; r++) {
            for (int c = colStart; c < colStart + 3; c++) {
                square[r-rowStart][c-colStart] = numbers[r][c];
            }
        }

        return square;
    }

    //checks if in column
    private boolean isInColumn(int i, int col) {
        for (int r = 0; r < numbers.length; r++) {
            if(i == numbers[r][col]) {
                return true;
            }
        }
        return false;
    }


    //checks if in row from value
    private boolean isInRow(int i, int row) {
        for (int c = 0; c < numbers[row].length; c++) {
            if(i == numbers[row][c]) {
                return true;
            }
        }
        return false;
    }



    public int[][] getNumbers() {
        return numbers;
    }

}

