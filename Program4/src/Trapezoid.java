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
        return ((this.getTopSide()+this.getBottomSide())/2*(this.getTopLeftPoint().getY()-this.getBottomLeftPoint().getY()));
    }
    public double getPerimeter() {
        //topleft bottomleft
        //this.getTopLeftPoint().getDistance(this.getBottomLeftPoint())
        //topSide
        //this.getTopSide()
        //bottomside
        //this.getBottomSide()
        //endpoints
        Point endPointTop = new Point(this.getTopLeftPoint().getX()+getTopSide(), this.getTopLeftPoint().getY());
        Point endPointBottom = new Point(this.getBottomLeftPoint().getX()+this.getBottomSide(), this.getBottomLeftPoint().getY());
        return (this.getTopLeftPoint().getDistance(this.getBottomLeftPoint())+this.getTopSide()+this.getBottomSide()+ endPointTop.getDistance(endPointBottom));
    }
}
