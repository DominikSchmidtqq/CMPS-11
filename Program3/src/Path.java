import java.util.*;
public class Path {
    double length;
    ArrayList<Integer> points;
    Path(){
        ArrayList<Integer>points = new ArrayList<Integer>();
        this.points = points;
    }
    public Path addPoint(int x, int y){
        this.points.add(x);
        this.points.add(y);
        return path;
    }
    public boolean removePoint(int i){
        int index = ((this.points.indexOf(i)+1)/2);
        this.points.remove(index);
        this.points.remove(index+1);
        return true;
    }
    public void addPath(Path p){

    }
    public double getLength(){

    }
    boolean isLonger(Path p){

    }
    public static void main(String args[]){
        Path path = new Path();
    }


}
