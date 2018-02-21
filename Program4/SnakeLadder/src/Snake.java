/**
 * Created by domin on 2/20/2018.
 */
public class Snake {
    int headPosition, tailPosition;
    public Snake(int headPosition, int tailPosition){
        this.headPosition = headPosition;
        this.tailPosition = tailPosition;
    }
    public int getTail(){
        return this.tailPosition;
    }
    public String toString(){
        return "head - tail."+this.headPosition+" - "+this.getTail()+".";
    }
}
