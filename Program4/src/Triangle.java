/**
 * Created by domin on 2/19/2018.
 */
class Triangle extends Shape{
    Point firstPoint;
    Point secondPoint;
    Point thirdPoint;
    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint){
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }
    public Point getFirstPoint(){
        return this.firstPoint;
    }
    public Point getSecondPoint(){
        return this.secondPoint;
    }
    public Point getThirdPoint(){
        return this.thirdPoint;
    }
    public double getPerimeter() {
        return 0;
    }
    public double getArea(){
        return 0;
    }
    public Point getPointOfSymmetry() {
        return null;
    }
}
