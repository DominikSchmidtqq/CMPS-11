/**
 * Created by domin on 2/5/2018.
 */
package Bingo;
public class Card {
    int[][] numbers;
    boolean[][] marked;

    Card(int[][] numbers) {
        this.numbers = new int[numbers.length][numbers.length];
        this.marked = new boolean[numbers.length][numbers.length];
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[0].length; j++){
                this.numbers[i][j] = numbers[i][j];
                this.marked[i][j] = false;
            }
        }
    }

    public int getNumber(int Row, int Column) {
        return this.numbers[Row][Column];
    }

    public boolean isMarked(int row, int column) {
        if (this.getMarked(row,column) == true){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean getMarked(int r, int c){
        return this.marked[r][c];
    }

    public void markNumber(int number) {
        for(int i = 0; i < marked.length; i++){
            for (int j = 0; j < marked[0].length; j++){
                if (this.getNumber(i, j) == number&&(this.isMarked(i,j)==false)){
                    this.marked[i][j] = true;
                }
            }
        }
    }
}