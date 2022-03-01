package lab5Q2;

public class Triangle extends Shape {

    public Triangle(double base, double height) {
        super(base, height);
    }

    public double area(){
        System.out.println("Inside Area of Triangle");
        return 0.5 * super.getDim1() * super.getDim2();
    }
    
}
