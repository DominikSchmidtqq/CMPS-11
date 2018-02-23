/**
 * Created by domin on 2/19/2018.
 */
class Point {
    private double x;
    private double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double getDistance(Point point){
        return Math.hypot(this.getX()-point.getX(), this.getY()-point.getY());
    }
}
