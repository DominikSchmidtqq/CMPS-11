/**
 * Created by domin on 2/20/2018.
 */
public class Ladder {
    int startPosition,endPosition;
    public Ladder(int startPosition, int endPosition){
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }
    public int getTop(){
        return this.endPosition;
    }
    public String toString(){
        return "start - end."+this.startPosition+" - "+this.getTop()+".";
    }
}
