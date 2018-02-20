/**
 * Created by domin on 2/19/2018.
 */
class Trapezoid extends Shape {
    Point topLeftPoint;
    Point bottomLeftPoint;
    double topSide;
    double bottomSide;
    public Trapezoid(Point topLeftPoint, Point bottomLeftPoint, double topSide, double bottomSide){
        this.topLeftPoint = topLeftPoint;
        this.bottomLeftPoint = bottomLeftPoint;
        this.topSide = topSide;
        this.bottomSide = bottomSide;
    }
    public Point getBottomLeftPoint(){
        return this.bottomLeftPoint;
    }
    public Point getTopLeftPoint(){
        return this.topLeftPoint;
    }
    public double getTopSide(){
        return this.topSide;
    }
    public double getBottomSide(){
        return this.bottomSide;
    }
    public double getArea() {
        return 0;
    }
    public double getPerimeter() {
        return 0;
    }
}
