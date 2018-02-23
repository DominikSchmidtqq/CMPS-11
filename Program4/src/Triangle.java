/**
 * Created by domin on 2/19/2018.
 */
class Triangle extends Shape{
    private Point firstPoint;
    private Point secondPoint;
    private Point thirdPoint;
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
        double area = 0;
        double s = this.getPerimeter()/2;
        double side1 = this.getFirstPoint().getDistance(this.getSecondPoint());
        double side2 = this.getSecondPoint().getDistance(this.getThirdPoint());
        double side3 = this.getThirdPoint().getDistance(this.getFirstPoint());
        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }
}