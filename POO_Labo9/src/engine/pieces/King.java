/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine.pieces;

import engine.board.Cell;

/**
 *
 * @author Alois
 */
public class King extends Piece{

    public King() {
        super(null, null);
    }

    @Override
    public boolean isMoveLegal(Cell from, Cell to) {
        return super.isMoveLegal(from, to);
    }
    
    
}
