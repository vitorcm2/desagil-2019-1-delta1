package br.pro.hashi.ensino.desagil.desafio.model;

import javax.swing.*;
import java.util.Stack;

public class HumanPlayer extends Player {
    private Timer timer;

    HumanPlayer(int row,int col,   Board board) {
        super(row,   col,board);
    }

    public void move(int rowShift, int colShift) {
        super.move(rowShift, colShift);
    }

    void moveUp() {
        if (row>0 && !board.isWall(row - 1, col)) {
            move(-1, 0);
        }
    }

    void moveRight() {
        if (col   <   board.getNumCols() - 1 && !board.isWall(row, col + 1)) {
            move(0, 1);
        }
    }

    void moveDown() {
        if (row <      board.getNumRows() - 1 && !board.isWall(row + 1, col)) {
            move(1, 0);
        }
    }

    void moveLeft() {
        if (col  >0 && !board.isWall(row,col - 1)) {
            move(0, -1)  ;
        }
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }
}
