/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine.board;

import chess.ChessController;
import chess.ChessView;
import chess.PieceType;
import engine.pieces.*;
import chess.PlayerColor;

/**
 *
 * @author Alois
 */
public class Board implements ChessController {

    private Piece[][] pieces;
    private ChessView CV;

    public Board(){
        pieces = new Piece[8][8];
    }
    
    @Override
    public void newGame() {
        /**/
        pieces[0][0] = new Rook(PlayerColor.BLACK);
        pieces[0][1] = new Knight(PlayerColor.BLACK);
        pieces[0][2] = new Bishop(PlayerColor.BLACK);
        pieces[0][3] = new King(PlayerColor.BLACK);
        pieces[0][4] = new Queen(PlayerColor.BLACK);
        pieces[0][5] = new Knight(PlayerColor.BLACK);
        pieces[0][6] = new Bishop(PlayerColor.BLACK);
        pieces[0][7] = new Rook(PlayerColor.BLACK);

        pieces[7][0] = new Rook(PlayerColor.WHITE);
        pieces[7][1] = new Knight(PlayerColor.WHITE);
        pieces[7][2] = new Bishop(PlayerColor.WHITE);
        pieces[7][3] = new King(PlayerColor.WHITE);
        pieces[7][4] = new Queen(PlayerColor.WHITE);
        pieces[7][5] = new Knight(PlayerColor.WHITE);
        pieces[7][6] = new Bishop(PlayerColor.WHITE);
        pieces[7][7] = new Rook(PlayerColor.WHITE);

        // pawns
        for (int i = 0; i < 8; i++) {
            pieces[1][i] = new Pawn(PlayerColor.BLACK);
            pieces[6][i] = new Pawn(PlayerColor.WHITE);
        }
        
        for (int col = 0; col < 8; col++) {
            for (int row = 0; row < 2; row++) {
                if (pieces[row][col] != null) {
                    CV.putPiece(pieces[row][col].getType(), PlayerColor.BLACK, col, row);
                }
            }
            for (int row = 6; row < 8; row++) {
                if (pieces[row][col] != null) {
                    CV.putPiece(pieces[row][col].getType(), PlayerColor.WHITE, col, row);
                }
            }
        }

    }

    ;
    
    @Override
    public boolean move(int startX, int startY, int endX, int endY) {
        /**/
        if (pieces[startX][startY] == null) {
            return false;
        }

        Cell from = new Cell(startX, startY);
        Cell to = new Cell(endX, endY);
        if (!pieces[startX][startY].isMoveLegal(from, to)) {
            return false;
        }
        if (!pieces[startX][startY].isMovePossible(from, to)) {
            return false;
        }
        pieces[startX][startY].moveFromTo(from, to);

        return false;
    }

    @Override
    public void start(ChessView CV) {
        /**/
        this.CV = CV;

        CV.startView();
    }
}
