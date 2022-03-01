package lab5Q2;

public class Square extends Shape{

    public Square(double length, double height) {
        super(length, height);
    }

    public double area(){
        System.out.println("Inside Area of Square");
        return super.getDim1() * super.getDim2();
    }
    
}
