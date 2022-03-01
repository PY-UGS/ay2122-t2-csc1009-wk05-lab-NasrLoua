package lab5Q2;

public class Rectangle extends Shape {

    public Rectangle(double length, double height) {
        super(length, height);
    }

    public double area(){
        System.out.println("Inside Area of Rectangle");
        return super.getDim1() * super.getDim2();

    }
    
}
