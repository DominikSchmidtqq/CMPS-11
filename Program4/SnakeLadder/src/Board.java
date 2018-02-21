/**
 * Created by domin on 2/20/2018.
 */
public class Board {
    Cell[][] board;
    public Board(int n){
        this.board = new Cell[n][n];
    }
    public void setCellToLadder(int startPosition, int endPosition){
        new Ladder(startPosition, endPosition);
    }
    public void setCellToSnake(int headPosition, int tailPosition){
        new Snake(headPosition, tailPosition);
    }
    public Cell[] getCells(){
        return new Cell[this.board[0].length*this.board.length];
    }
}
