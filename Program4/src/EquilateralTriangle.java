/**
 * Created by domin on 2/19/2018.
 */
class EquilateralTriangle extends Triangle implements Symmetric{
    Point topPoint;
    double side;
    public EquilateralTriangle(Point topPoint, double side){
        super(topPoint, new Point(topPoint.getX()+side, topPoint.getY()), new Point(topPoint.getX()-side, topPoint.getY()));
    }
    public Point getTopPoint(){
        return this.topPoint;
    }
    public double getSide(){
        return this.getSide();
    }
    public Point getPointOfSymmetry() {
        double x1 = 0;
        double y1 = 0;
        x1 = (this.getFirstPoint().getX()+this.getSecondPoint().getX()+this.getThirdPoint().getX())/3;
        y1 = (this.getFirstPoint().getY()+this.getSecondPoint().getY()+this.getThirdPoint().getY())/3;
        return new Point(x1, y1);
    }
    public double getArea() {
        return super.getArea();
    }
    public double getPerimeter() {
        return super.getPerimeter();
    }
    public Point getFirstPoint() {
        return super.getFirstPoint();
    }
    public Point getSecondPoint() {
        return super.getSecondPoint();
    }
    public Point getThirdPoint() {
        return super.getThirdPoint();
    }
}
