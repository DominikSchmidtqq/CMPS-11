/**
 * Created by domin on 2/5/2018.
 */
class Card extends Player{
    int[][] numbers;
    boolean[][] marked;

    Card(int[][] numbers) {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
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
        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (this.getNumber(i, j) == number&&(this.isMarked(i,j)==false)){
                    this.marked[i][j] = true;
                }
            }
        }
    }
}
