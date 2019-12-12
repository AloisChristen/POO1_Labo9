/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine.board;

/**
 *
 * @author Alois
 */
public class Cell {
    public final int row;
    public final int col;
    
    Cell(int _row, int _col){
        if(_row < 0 || _row >= 8 || _col < 0 || _col >= 8)
            throw new RuntimeException("Cell not on the board, check position");
        row = _row;
        col = _col;
    }
}
