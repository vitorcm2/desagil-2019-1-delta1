package br.pro.hashi.ensino.desagil.desafio.model;

public abstract class Player extends Element {
    @SuppressWarnings("PackageVisibleField")
    final Board board;

    Player(int row, int col, Board board) {
        super(row, col);
        this.board = board;
    }

    void move(int rowShift, int colShift) {
        row += rowShift;
        col += colShift;
    }
}
