package Q1;

public class Rectangle extends Shape{
    private double length1,length2;
    
    public void inputLength(double length1,double length2){
        this.length1=length1;
        this.length2=length2;
    }
    
    public double calPeri(){
        perimeter = ((2*length1)+(2*length2));
        return perimeter;
    }
    
    public double calArea(){
        area = length1*length2;
        return area;
    }
    
    
}
