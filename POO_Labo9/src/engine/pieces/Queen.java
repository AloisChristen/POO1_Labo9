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
public class Queen extends Piece{

    public Queen(PlayerColor color) {
        super(color);
    }

    @Override
    public boolean isMoveLegal(Cell from, Cell to) {
        return super.isMoveLegal(from, to);
    }
     
    public PieceType getType(){
        return PieceType.QUEEN;
    }
}
