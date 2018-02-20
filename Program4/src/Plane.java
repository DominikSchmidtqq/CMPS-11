/**
 * Created by domin on 2/19/2018.
 */
public class Plane {
    Shape[] shapes;
    public Plane(){
        new Plane();
    }
    public Shape[] getShape(){
        return this.shapes;
    }
    public void addShape(Shape shape){
        Shape[] temp = new Shape[shapes.length+1];
        for(int i = 0; i < shapes.length; i++){
            shapes[i] = temp[i];
        }
        temp[shapes.length] = shape;
        shapes = temp;
    }
    public double getSumOfAreas(){
        double area = 0;
        for (int i = 0; i < shapes.length; i++){
            area += shapes[i].getArea();
        }
        return area;
    }
    public double getSumOfPerimeters(){
        double perimeter = 0;
        for (int i = 0; i < shapes.length; i++){
            perimeter += shapes[i].getPerimeter();
        }
        return perimeter;
    }
    public Point getCenterOfPointOfSymmetries(){
        double x = 0;
        double y = 0;
        double numX = 0;
        double numY = 0;
        for(Shape s : shapes){
            if(s instanceof Symmetric){
                x+=((Symmetric) s).getPointOfSymmetry().getX();
                y+= ((Symmetric) s).getPointOfSymmetry().getY();
                numX++;
                numY++;
            }
        }
        if (numX >0){
            return new Point((x/numX), (y/numY));
        }
        else
            return null;
    }
}
