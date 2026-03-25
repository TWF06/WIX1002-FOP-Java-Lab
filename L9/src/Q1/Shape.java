package Q1;

public class Shape {
    protected String name;
    protected double perimeter,area;
    
    public double getPerimeter(){
        return perimeter;
    }
    
    public double getArea(){
        return area;
    }
    
    public void setPerimeter(double perimeter){
        this.perimeter=perimeter;
    }
    
    public void setArea(double area){
        this.area = area;
    }
    
    public void display(){
        System.out.println("\nName: "+name);
        System.out.printf("Perimeter: %.2f\n",perimeter);
        System.out.printf("Area: %.2f\n",area);
    }
}
