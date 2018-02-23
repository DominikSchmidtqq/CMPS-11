import static java.lang.Math.*;

/**
 * Created by domin on 2/10/2018.
 */
public class Path{
    private int[] points;
    private Path(){
        this.points = new int[0];
    }

    public Path addPoint(int x, int y){
        int[] array1 = new int[this.points.length+2];
        for (int i = 0; i < this.points.length; i++){
            array1[i] = this.points[i];
        }
        this.points = array1;
        this.points[this.points.length-2]=x;
        this.points[this.points.length-1]=y;
        return this;
    }

    public String getPoint(int index) {
        return "("+this.points[(index)*2]+","+this.points[index*2+1]+")";
    }

    public int numOfPoints(){
        return (this.points.length/2);
    }

    public boolean removePoint(int index){
        if (index <= this.points.length/2){
            int[] newArray = new int[this.points.length-2];
            for(int i=0; i< index*2;i++){
                newArray[i] = this.points[i];
            }
            for (int i = index*2; i < newArray.length-1;i++){
                newArray[i] = this.points[i+2];
            }
            this.points = newArray;
            return true;
        }
        return false;
    }

    void addPath(Path p){
        int length = this.points.length + p.points.length;
        int[] newArray = new int[length];
        for(int i = 0; i < this.points.length; i++){
            newArray[i] = this.points[i];
        }
        for (int i = 0; i < p.points.length; i++){
            newArray[i+this.points.length] = p.points[i];
        }
        this.points = newArray;
    }

    public double getLength(){
        double sum = 0;
        if (this.points.length >=4) {
            for (int i = 0; i < this.points.length - 3; i += 2) {
                sum = sum+calculate((double)this.points[i], (double)this.points[i + 1],(double) this.points[i + 2], (double)this.points[i + 3]);
            }
        }
        return sum;
    }

    public double getDistance(){
        return calculate(this.points[0], this.points[1], this.points[this.points.length-2], this.points[this.points.length-1]);
    }

    public double calculate(double x1, double y1, double x2, double y2){
        return Math.hypot(x1-x2, y1-y2);
    }

    public boolean isLonger(Path p){
        if (this.getLength() > p.getLength()){
            return true;
        }
        else return false;
    }
}
