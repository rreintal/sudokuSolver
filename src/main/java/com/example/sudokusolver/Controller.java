package com.example.sudokusolver;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.util.Timer;

public class Controller {

    // row 1
    @FXML
    private TextArea x0_y0;
    @FXML
    private TextArea x0_y1;
    @FXML
    private TextArea x0_y2;
    @FXML
    private TextArea x0_y3;
    @FXML
    private TextArea x0_y4;
    @FXML
    private TextArea x0_y5;
    @FXML
    private TextArea x0_y6;
    @FXML
    private TextArea x0_y7;
    @FXML
    private TextArea x0_y8;

    //row 2
    @FXML
    private TextArea x1_y0;
    @FXML
    private TextArea x1_y1;
    @FXML
    private TextArea x1_y2;
    @FXML
    private TextArea x1_y3;
    @FXML
    private TextArea x1_y4;
    @FXML
    private TextArea x1_y5;
    @FXML
    private TextArea x1_y6;
    @FXML
    private TextArea x1_y7;
    @FXML
    private TextArea x1_y8;

    // row 3
    @FXML
    private TextArea x2_y0;
    @FXML
    private TextArea x2_y1;
    @FXML
    private TextArea x2_y2;
    @FXML
    private TextArea x2_y3;
    @FXML
    private TextArea x2_y4;
    @FXML
    private TextArea x2_y5;
    @FXML
    private TextArea x2_y6;
    @FXML
    private TextArea x2_y7;
    @FXML
    private TextArea x2_y8;

    // row 4
    @FXML
    private TextArea x3_y0;
    @FXML
    private TextArea x3_y1;
    @FXML
    private TextArea x3_y2;
    @FXML
    private TextArea x3_y3;
    @FXML
    private TextArea x3_y4;
    @FXML
    private TextArea x3_y5;
    @FXML
    private TextArea x3_y6;
    @FXML
    private TextArea x3_y7;
    @FXML
    private TextArea x3_y8;

    // row 5
    @FXML
    private TextArea x4_y0;
    @FXML
    private TextArea x4_y1;
    @FXML
    private TextArea x4_y2;
    @FXML
    private TextArea x4_y3;
    @FXML
    private TextArea x4_y4;
    @FXML
    private TextArea x4_y5;
    @FXML
    private TextArea x4_y6;
    @FXML
    private TextArea x4_y7;
    @FXML
    private TextArea x4_y8;

    // row 6
    @FXML
    private TextArea x5_y0;
    @FXML
    private TextArea x5_y1;
    @FXML
    private TextArea x5_y2;
    @FXML
    private TextArea x5_y3;
    @FXML
    private TextArea x5_y4;
    @FXML
    private TextArea x5_y5;
    @FXML
    private TextArea x5_y6;
    @FXML
    private TextArea x5_y7;
    @FXML
    private TextArea x5_y8;

    //row 7
    @FXML
    private TextArea x6_y0;
    @FXML
    private TextArea x6_y1;
    @FXML
    private TextArea x6_y2;
    @FXML
    private TextArea x6_y3;
    @FXML
    private TextArea x6_y4;
    @FXML
    private TextArea x6_y5;
    @FXML
    private TextArea x6_y6;
    @FXML
    private TextArea x6_y7;
    @FXML
    private TextArea x6_y8;

    // row 8
    @FXML
    private TextArea x7_y0;
    @FXML
    private TextArea x7_y1;
    @FXML
    private TextArea x7_y2;
    @FXML
    private TextArea x7_y3;
    @FXML
    private TextArea x7_y4;
    @FXML
    private TextArea x7_y5;
    @FXML
    private TextArea x7_y6;
    @FXML
    private TextArea x7_y7;
    @FXML
    private TextArea x7_y8;

    // row 9
    @FXML
    private TextArea x8_y0;
    @FXML
    private TextArea x8_y1;
    @FXML
    private TextArea x8_y2;
    @FXML
    private TextArea x8_y3;
    @FXML
    private TextArea x8_y4;
    @FXML
    private TextArea x8_y5;
    @FXML
    private TextArea x8_y6;
    @FXML
    private TextArea x8_y7;
    @FXML
    private TextArea x8_y8;

    @FXML
    private Label katseteLabel;

    private TextArea[][] board;

    private final int GRID_SIZE = 9;

    private int katsed = 0;

    @FXML
    public void initialize() {
        board = new TextArea[][] {
                {x0_y0, x0_y1, x0_y2, x0_y3, x0_y4, x0_y5, x0_y6, x0_y7, x0_y8},
                {x1_y0, x1_y1, x1_y2, x1_y3, x1_y4, x1_y5, x1_y6, x1_y7, x1_y8},
                {x2_y0, x2_y1, x2_y2, x2_y3, x2_y4, x2_y5, x2_y6, x2_y7, x2_y8},
                {x3_y0, x3_y1, x3_y2, x3_y3, x3_y4, x3_y5, x3_y6, x3_y7, x3_y8},
                {x4_y0, x4_y1, x4_y2, x4_y3, x4_y4, x4_y5, x4_y6, x4_y7, x4_y8},
                {x5_y0, x5_y1, x5_y2, x5_y3, x5_y4, x5_y5, x5_y6, x5_y7, x5_y8},
                {x6_y0, x6_y1, x6_y2, x6_y3, x6_y4, x6_y5, x6_y6, x6_y7, x6_y8},
                {x7_y0, x7_y1, x7_y2, x7_y3, x7_y4, x7_y5, x7_y6, x7_y7, x7_y8},
                {x8_y0, x8_y1, x8_y2, x8_y3, x8_y4, x8_y5, x8_y6, x8_y7, x8_y8}
                };
    }

    @FXML
    protected void restartButton() {
        for (TextArea[] textAreas : board) {
            for (TextArea textArea : textAreas) {
                textArea.setText("0");
            }
        }
    }

    @FXML
    protected void getBoardButton() {
        for (TextArea[] textAreas : board) {
            for (TextArea textArea : textAreas) {
                textArea.setText(textArea.getText());
            }
        }

    }


    @FXML
    protected void solveButton() {
        solveBoard(board);
        katseteLabel.setText("Katsete arv: " +katsed);
    }

    // sudoku solver algorithm

    private boolean numberInRow(TextArea[][] board, int number, int row) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (Integer.valueOf( board[row][i].getText() ).equals(number)) {
                return true;
            }
        }
        return false;
    }

    private boolean numberInColumn(TextArea[][] board, int number, int column) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (Integer.valueOf( board[i][column].getText() ).equals(number)){
                return true;
            }
        }
        return false;
    }

    private boolean numberInSquare(TextArea[][] board, int number, int row, int column) {
        int localBoxRow = row - row % 3;
        int localBoxColumn = column - column % 3;

        for (int i = localBoxRow; i < localBoxRow + 3; i++) {
            for (int j = localBoxColumn; j < localBoxColumn + 3; j++) {
                if (Integer.valueOf(board[i][j].getText()).equals(number)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isValidPlacement(TextArea[][] board, int number, int row, int column) {
        return !numberInColumn(board, number, column) && !numberInRow(board, number, row)
                && !numberInSquare(board, number, row, column);
    }

    private boolean solveBoard(TextArea[][] board){
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int column = 0; column < GRID_SIZE; column++) {
                if (Integer.valueOf(board[row][column].getText()).equals(0)) {
                    for (int numberToTry = 1; numberToTry <= GRID_SIZE ; numberToTry++) {
                        if (isValidPlacement(board, numberToTry, row, column)) {
                            board[row][column].setText(String.valueOf(numberToTry));

                            if (solveBoard(board)) { // rekursioon
                                return true;
                            }
                            else { // kui see number mis pandi, ei sobi, siis "reseti"
                                board[row][column].setText("0");
                                katsed++;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        System.out.println("Katsete arv:" + katsed);
        return true;
    }
}