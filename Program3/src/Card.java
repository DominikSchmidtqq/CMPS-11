/**
 * Created by domin on 2/5/2018.
 */
public class Card {
    int[][] numbers;
    boolean marked;
    public Card(int[][] numbers) {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                this.numbers[i][j] = numbers[i][j];
            }
        }
    }

    public int getNumber(int Row, int Column) {
        return this.numbers[Row][Column];
    }

    public boolean isMarked(int row, int column) {
        if (this.getNumber([row][column]).marked == true){
            return true;
        }
        else{
            return false;
        }
    }

    public void markNumber(int number) {
        
    }
}
