package Q1;

public class Square extends Shape{
    private double length;
    
    public void inputLength(double len){
        length =len;
    }
    
    public double calPeri(){
        perimeter = 4*length;
        return perimeter;
    }
    
    public double calArea(){
        area = length*length;
        return area;
    }
}
