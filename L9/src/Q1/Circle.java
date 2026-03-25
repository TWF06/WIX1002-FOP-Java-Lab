package Q1;

public class Circle extends Shape{
    private double diameter;
    
    public void inputDiameter(double a){
        diameter = a;
    }
    
    public double calPeri(){
        perimeter = 2*Math.PI*(diameter/2.0);
        return perimeter;
    }
    
    public double calArea(){
        area = Math.PI*(diameter/2.0)*(diameter/2.0);
        return area;
    }
}
