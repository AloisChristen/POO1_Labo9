/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine.pieces;

import chess.PieceType;
import chess.PlayerColor;
import engine.board.Cell;

/**
 *
 * @author Alois
 */
public class Pawn extends Piece{
    
    private boolean hasMoved;

    public Pawn(PlayerColor color) {
        super(color);
        hasMoved = false;
    }

    @Override
    public boolean isMoveLegal(Cell from, Cell to) {
        return super.isMoveLegal(from, to); //To change body of generated methods, choose Tools | Templates.
    }
    
    public PieceType getType(){
        return PieceType.PAWN;
    }
}
