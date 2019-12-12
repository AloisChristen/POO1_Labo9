/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine.pieces;

import chess.PieceType;
import engine.board.Cell;
import chess.PlayerColor;

/**
 *
 * @author Alois
 */
public class Rook extends Piece{
    
    private boolean hasMoved;

    public Rook(PlayerColor color) {
        super(color);
        hasMoved = false;
    }

    @Override
    public boolean isMoveLegal(Cell from, Cell to) {
        return super.isMoveLegal(from, to);
    }
    
    public PieceType getType(){
        return PieceType.ROOK;
    }
    
    
}
