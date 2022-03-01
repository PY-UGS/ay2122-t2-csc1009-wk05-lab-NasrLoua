package lab5Q2;

 abstract class Shape {

    private final static double PI = 3.14;
    private double dim1;
    private double dim2;

    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
        
    }

    public double getPI(){
        return PI; 
    }


    public double getDim1() {
        return this.dim1;
    }

    public void setDim1(double dim1) {
        this.dim1 = dim1;
    }

    public double getDim2() {
        return this.dim2;
    }

    public void setDim2(double dim2) {
        this.dim2 = dim2;
    }

    abstract double area(); 
    
}
