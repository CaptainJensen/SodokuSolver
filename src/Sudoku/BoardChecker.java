package Sudoku;

/**
 * Created by Jensen on 1/4/17.
 */
public class BoardChecker {

    private int[][] board;

    public BoardChecker(int[][] values) {

        board = values;

    }

//    //checks every value in the board
//    public boolean isBoardPossible() {
//        for (int r = 0; r < board.length; r++) {
//            for (int c = 0; c < board[r].length; c++) {
//                if(isPossibleDigit(board[r][c], r, c) && board[r][c] != 0) {
//                                        //add ! here if needed
//                    System.out.println();
//                    System.out.println("Location of error: r=" + r +" c=" + c);
//                    System.out.println("Error Number: " + board[r][c]);
//                    System.out.println();
//                    return false;
//                }
//            }
//        }
//        return true;
//    }


    //checks to see if value is possible in puzzle
    public boolean isPossibleDigit(int i, int row, int col) {
//        if(isInRow(i,row)) {
//            System.out.println(i+  " is in row");
//            return false;
//        }
//        else if(isInColumn(i,col)) {
//            System.out.println(i+  " is in column");
//            return false;
//        }
//        else if(isInSquare(i,row,col)) {
//            System.out.println(i+  " is in square");
//            return false;
//        }
//        return true;

        //return !isInRow(i,row) && !isInColumn(i,col) && !isInSquare(i,row,col);


        return !isInRow(i, row) && !isInColumn(i, col) && !isInSquare(i, row, col);
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
                square[r-rowStart][c-colStart] = board[r][c];
            }
        }

        return square;
    }

    //checks if in column
    private boolean isInColumn(int i, int col) {
        for (int r = 0; r < board.length; r++) {
            if(i == board[r][col]) {
                return true;
            }
        }
        return false;
    }


    //checks if in row from value
    private boolean isInRow(int i, int row) {
        for (int c = 0; c < board[row].length; c++) {
            if(i == board[row][c]) {
                return true;
            }
        }
        return false;
    }


    public void setBoard(int[][] board) {
        this.board = board;
    }
}
