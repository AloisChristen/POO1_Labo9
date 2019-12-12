/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine.board;

import engine.board.Board;

/**
 *
 * @author Alois
 */
public class Case {
    private Board board;
    private final int row;
    private final int col;
    
    public Case(Board _board, int _row, int _col){
        this.board = _board;
        this.row = _row;
        this.col = _col;
    }
}
