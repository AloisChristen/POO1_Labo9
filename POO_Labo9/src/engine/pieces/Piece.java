/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine.pieces;

import chess.PlayerColor;
import chess.PieceType;
import engine.board.Case;

/**
 *
 * @author Alois
 */
public abstract class Piece {
    
    private final PlayerColor color;
    private PieceType type; // Un pion peut se transformer
    
    public Piece(PlayerColor _color, PieceType _type){
        this.color = _color;
        this.type = _type;
    }
    
    public boolean isWhite(){
        return this.color == PlayerColor.WHITE;
    }
    
    public boolean isMoveLegal(Case from, Case to){
        return false;
    }
}
