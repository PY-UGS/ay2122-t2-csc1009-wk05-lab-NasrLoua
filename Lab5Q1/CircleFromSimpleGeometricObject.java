package lab5Q1;

public class CircleFromSimpleGeometricObject extends GeometricObject {

    private double radius;


    public CircleFromSimpleGeometricObject() {
        this.radius  = 0;
    }

    public CircleFromSimpleGeometricObject(double radius) {
        this.radius = radius;
    }

    public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }


    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area = 3.1416 * this.radius * this.radius;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2 * 3.1416 * this.radius;
        return perimeter;
    }

    public double getDiameter(){
        double diameter = this.radius * 2;
        return diameter;

    }

    public void printCircle(){
       System.out.print("Print Circle");
    }


}
