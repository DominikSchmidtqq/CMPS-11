/**
 * Created by domin on 2/19/2018.
 */
class Rectangle extends Shape{
    Point topLeftPoint;
    double length;
    double width;
    public Rectangle(Point topLeftPoint, double length, double width){
        this.topLeftPoint = topLeftPoint;
        this.length = length;
        this.width = width;
    }
    public Point getTopLeftPoint(){
        return this.topLeftPoint;
    }
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    public double getPerimeter(){
        return 0;
    }
    public double getArea(){
        return 0;
    }
}
