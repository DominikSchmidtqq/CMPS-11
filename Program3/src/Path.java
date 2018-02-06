import java.awt.*;
public class Path {
    Point[] points;
    Point[] newArray;
    Path path;
    Path(){
        this.points = new Point[0];
    }
    public Path addPoint(int x, int y){
        this.points[points.length-1] = new Point(x,y);
        return path;
    }
    public boolean removePoint(int index){
        if (index <= this.points.length - 1){
            Point[] newArray = new Point[this.points.length-2];
            for(int i = 0; i < index; i++){
                newArray[i] = this.points[i];
            }
            for(int i = index; i < newArray.length; i++){
                newArray[i] = this.points[i];
            }
            this.points = newArray;
            return true;
        }
        else
            return false;
    }
    void addPath(Path p){
        int length = this.points.length + p.points.length;
        newArray = new Point[length];
        for (int i = 0; i < this.points.length; i++){
            newArray[i] = this.points[i];
        }
        for (int i = this.points.length; i < p.points.length; i++){
            newArray[i] = p.points[i];
        }
    }
    public double getLength(){
        double sum = 0;
        for (int i = 0; i < this.points.length-2; i++){
            sum += this.points[i].distance(this.points[i+1]);
        }
        return sum;
    }
    public double getDistance(){
        return this.points[0].distance(this.points[this.points.length-1]);
    }
    boolean isLonger(Path p){
        if (this.getDistance() > p.getDistance()){
            return true;
        }
        else return false;
    }
    public static void main(String args []){
        Path path = new Path();
        path.addPoint(0,0);
    }
}