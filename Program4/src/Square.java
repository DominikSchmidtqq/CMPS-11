/**
 * Created by domin on 2/19/2018.
 */
class Square extends  Rectangle implements Symmetric{
    Point topLeft;
    double side;
    public Square(Point topLeft, double side){
        super(topLeft, side,side);
    }
    public double getSide(){
        return this.side;
    }
    public double getArea() {
        return super.getArea();
    }
    public double getPerimeter() {
        return super.getPerimeter();
    }
    public Point getPointOfSymmetry() {
        return null;
    }
}