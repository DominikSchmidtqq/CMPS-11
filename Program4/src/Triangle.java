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
        return this.getFirstPoint().getDistance(getSecondPoint())+ this.getFirstPoint().getDistance(getThirdPoint())+ this.getSecondPoint().getDistance(getThirdPoint());
    }
    public double getArea(){
        double s = this.getPerimeter()/2;
        return (Math.sqrt((s*(s-this.getFirstPoint().getDistance(getSecondPoint())))*(s*(s-this.getFirstPoint().getDistance(getThirdPoint())))*(s*(s-this.getSecondPoint().getDistance(getThirdPoint())))));
    }
}