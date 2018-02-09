import java.util.Map;

public class Path1 {
    int[] points;
    Path1(){
        this( new int[0]);
    }
    Path1(int[] p){
        this.points = p;
    }
    public Path1 addPoint(int x, int y){
        int[] array1 = new int[this.points.length+2];
        for (int i = 0; i < this.points.length; i++){
            array1[i] = this.points[i];
        }
        this.points = array1;
        this.points[this.points.length-2]=x;
        this.points[this.points.length-1]=y;
        Path1 temp = new Path1(this.points);
        return temp;
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
    void addPath(Path1 p){
        int length = this.points.length + p.points.length;
        int[] newArray = new int[length];
        for(int i = 0; i < this.points.length-1; i++){
            newArray[i] = this.points[i];
        }
        for (int i = 0; i < p.points.length -1; i++){
            newArray[i+this.points.length-1] = p.points[i];
        }
        this.points = newArray;
    }
    public double getLength(){
        double sum = 0;
        if (this.points.length >=4) {
            for (int i = 0; i < this.points.length - 3; i += 2) {
                sum += calculate(this.points[i], this.points[i + 1], this.points[i + 2], this.points[i + 3]);
            }
        }
        return sum;
    }

    public double getDistance(){
        return calculate(this.points[0], this.points[1], this.points[this.points.length-2], this.points[this.points.length-1]);
    }
    public double calculate(int x1, int y1, int x2, int y2){
        return Math.hypot(x1-x2, y1-y2);
    }
    public boolean isLonger(Path1 p){
        if (this.getLength() > p.getLength()){
            return true;
        }
        else return false;
    }
    public String getPoint(int index){
        return "("+this.points[index*2-1]+","+this.points[index*2]+")";
    }
    public int numOfPoints(){
        return this.points.length/2;
    }
    public static void main(String args[]){
        Path1 path = new Path1();
        Path1 p = new Path1();
        p.addPoint(0,0);
        p.addPoint(2,2);
        path.addPoint(0,0);
        path.addPoint(1,1);
        path.addPath(p);
        path.removePoint(3);
        p.getDistance();
        System.out.println(path.getPoint(2));
        System.out.println(p.getLength());
        System.out.println(path.getLength());
        System.out.println(path.isLonger(p));
        System.out.println(path.numOfPoints());
    }
}
