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
        return (2*Math.PI*this.getRadius());
    }
    public double getArea() {
        return (Math.PI*this.getRadius()*this.getRadius());
    }
    public Point getPointOfSymmetry() {
        return this.getCenter();
    }
}
