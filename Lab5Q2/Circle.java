package lab5Q2;

public class Circle extends Shape {


    public Circle(double radius1, double radius2) {
        super(radius1, radius2);
    }

    
    public double area(){
        System.out.println("Inside Area of Circle");
        return super.getPI() * super.getDim1() * super.getDim2();
        
    }
}
