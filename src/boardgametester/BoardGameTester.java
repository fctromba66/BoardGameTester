/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgametester;
import games.board.*;
import games.utilities.*;

/**
 *
 * @author Francis Cuccio
 */
public class BoardGameTester {
    public static void main(String[] args) {
        // 3x3 board for Tic Tac Toe
        Board tttgameboard = new Board (3,3);
 
        // 6x7 board for Connect Four
        Board cfgameboard = new Board (6,7);
 
        // 5x8 board for Mastermind; blue mark
        Board mmgameboard = new Board (5,8);
        
        Boolean check = true;

        // Set a cell to a nought or cross on the Tic-Tac-Toe board.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (check == true) {
                    tttgameboard.setCell(Mark.NOUGHT, i, j);
                    check = false;
                } else {
                    tttgameboard.setCell(Mark.CROSS, i, j);
                    check = true;
                }
            }
        }

        // Set a cell to yellow or red on the Connect Four board.
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (check == true) {
                    cfgameboard.setCell(Mark.YELLOW, i, j);
                    check = false;
                } else {
                    cfgameboard.setCell(Mark.RED, i, j);
                    check = true;
                }
            }
        }

        // Set a cell to yellow, red, green, blue, magenta, or orange on the Mastermind board.
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if (j == 0) {
                    mmgameboard.setCell(Mark.ORANGE, i, j);
                } else if (j == 1) {
                    mmgameboard.setCell(Mark.MAGENTA, i, j);
                } else if (j == 3) {
                    mmgameboard.setCell(Mark.RED, i, j);
                } else {
                    mmgameboard.setCell(Mark.GREEN, i, j);
                }
            }
        }
 
        System.out.println (" Tic Tac Toe ");
        System.out.println(tttgameboard.toString());
 
        System.out.println(" Connect Four ");
        System.out.println(cfgameboard.toString());
 
        System.out.println (" Mastermind ");
        System.out.println(mmgameboard.toString());
        
        FileManager.writeToFileAsync(tttgameboard.toString(), "ttt.txt");
        FileManager.writeToFileAsync(cfgameboard.toString(), "c4.txt");
        FileManager.writeToFileAsync(mmgameboard.toString(), "mm.txt");
    }
}
