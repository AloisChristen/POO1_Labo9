/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine.board;

import chess.ChessController;
import chess.ChessView;
import engine.pieces.*;

/**
 *
 * @author Alois
 */
public class Board implements ChessController{
    
    private Piece[][] pieces;
    
    @Override
    public void newGame(){
        /**/
        
        
    };
    
    @Override
    public boolean move(int startX, int startY, int endX, int endY){
        /**/
        return false;
    }
    
    @Override
    public void start(ChessView CV){
        /**/
        CV.startView();
    }
}
