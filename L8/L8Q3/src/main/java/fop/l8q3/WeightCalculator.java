package fop.l8q3;

public class WeightCalculator {
    private int age;
    private double height;
    
    void input(int a,double b){
        this.age = a;
        this.height = b;
    }
    
    double recommendWeight(){
        return ((height-100+(age/10))*0.9);
    }
    
    void displayOutput(){
        System.out.println("Your age is "+age+" years old");
        System.out.println("Your height is "+height+" cm");
        System.out.println("Your recommended weight is "+ recommendWeight() + "kg");
    }
}
