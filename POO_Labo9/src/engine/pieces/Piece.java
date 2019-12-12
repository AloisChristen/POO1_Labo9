/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine.pieces;

import chess.PlayerColor;
import chess.PieceType;
import engine.board.Cell;

/**
 *
 * @author Alois
 */
public abstract class Piece {
    
    private final PlayerColor color;
    
    public Piece(PlayerColor _color){
        this.color = _color;
    }
    
    public boolean isWhite(){
        return this.color == PlayerColor.WHITE;
    }
    
    public boolean isMoveLegal(Cell from, Cell to){
        return false;
    }
    
    public boolean isMovePossible(Cell from, Cell to){
        return false;
    }
    
    public void moveFromTo(Cell from, Cell to){
    
    }
    
    public PieceType getType(){
        return null;
    }
}
