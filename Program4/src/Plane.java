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
        double x, y, numX, numY;
        for(int i = 0; i< shapes.length;i++){
            if(shapes[i] instanceof Symmetric){
            }
        }
        return null;
    }
}
