/**
 * Created by domin on 2/20/2018.
 */

public class Cell {
    int number;
    private Snake snake;
    private Ladder ladder;
    boolean Snake;
    boolean Ladder;
    boolean occupied = false;
    public Cell(int number){
        this.number = number;
    }
    public void setOccupied(boolean occupied){
        this.occupied = !this.occupied;
    }
    public boolean isOccupied(){
        return this.occupied;
    }
    public Ladder getLadder(){
        if (this.Ladder){
            return this.ladder;
        }
        else return null;
    }
    public Snake getSnake(){
        if (this.Snake){
            return this.snake;
        }
        else return null;
    }
    public void setLadder(Ladder ladder){
        new Ladder(ladder.startPosition, ladder.endPosition);
        this.Ladder = true;
        this.ladder = ladder;
    }
    public void setSnake(Snake snake){
        new Snake(snake.headPosition, snake.getTail());
        this.Snake = true;
        this.snake = snake;
    }
    public int getNumber(){
        return getCells.length;
    }
}
