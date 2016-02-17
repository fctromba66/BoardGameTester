/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games.board;

/**
 *
 * @author Francis Cuccio
 */
public class Cell {
    private Mark content;
    private int row, column;
    
    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
    content = Mark.EMPTY;
    }
    public Mark getContent() { return content; }
    public void setContent(Mark content) { this.content = content;
    }
    public int getRow() { return row; }
    public int getColumn() { return column; }
}
