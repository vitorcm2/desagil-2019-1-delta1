package br.pro.hashi.ensino.desagil.desafio.model;

import java.util.Random;

public class Target extends Element {
    private final Board board;
    private final Random random = new Random();

    public Target(int row, int col, Board board) {
        super(row, col);
        this.board = board;

    }

    protected void move(int rowShift, int colShift) {
        row += rowShift;
        col += colShift;
    }

    public void Movimento() {

        int Mov = random.nextInt(4);

        if (Mov == 1) {
            this.moveDown();
        }
        if (Mov == 2) {
            this.moveUp();
        }
        if (Mov == 3) {
            this.moveRight();
        }
        if (Mov == 0) {
            this.moveLeft();
        }

    }

    private void moveUp() {
        if (row > 0 && !board.isWall(row - 1, col)) {
            move(-1, 0);
        }
    }

    private void moveRight() {
        if (col < board.getNumCols() - 1 && !board.isWall(row, col + 1)) {
            move(0, 1);
        }
    }

    private void moveDown() {
        if (row < board.getNumRows() - 1 && !board.isWall(row + 1, col)) {
            move(1, 0);
        }
    }

    private void moveLeft() {
        if (col > 0 && !board.isWall(row, col - 1)) {
            move(0, -1);
        }

    }
}
