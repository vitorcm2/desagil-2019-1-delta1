package br.pro.hashi.ensino.desagil.desafio.model;

public class Target extends Element {
    private final Board board;

    public Target(int row, int col, Board board) {
        super(row, col);
        this.board = board;
    }
}
