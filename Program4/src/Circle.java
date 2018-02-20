/**
 * Created by domin on 2/19/2018.
 */
class Circle extends Shape implements Symmetric{
    Point center;
    double radius;
    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }
    public Point getCenter(){
        return this.center;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getPerimeter() {
        return 0;
    }
    public double getArea() {
        return 0;
    }
    public Point getPointOfSymmetry() {
        return this.getCenter();
    }
}
