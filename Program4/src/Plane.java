/**
 * Created by domin on 2/19/2018.
 */
public class Plane {
    Shape[] shapes;
    public Plane(){
        this.shapes = new Shape[0];
    }
    public Shape[] getShape(){
        return this.shapes;
    }
    public void addShape(Shape shape){
        Shape[] temp = new Shape[shapes.length+1];
        for(int i = 0; i < shapes.length; i++){
            temp[i] = shapes[i];
        }
        this.shapes = temp;
        shapes[shapes.length-1] = shape;

    }
    public double getSumOfAreas(){
        double area = 0;
        /*for (int i = 0; i < shapes.length; i++){
            area += shapes[i].getArea();
        }*/
        for(Shape s : shapes){
            area += s.getArea();
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
            Point SymmetricCenter = new Point((x/numX), (y/numY));
            return SymmetricCenter;
        }
        else
            return null;
    }
}
