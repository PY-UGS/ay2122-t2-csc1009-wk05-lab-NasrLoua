package lab5Q2;

public class Ellipse extends Shape{
    
    public Ellipse(double A, double B) {
        super(A, B);
    }

    public double area(){
        System.out.println("Inside Area For Ellipse");
        return super.getPI() * super.getDim1() * super.getDim2(); 
        
    }
}
