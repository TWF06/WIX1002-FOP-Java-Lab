package umfop.l2;
import java.util.Scanner;
public class L2Q1 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        double c,f;
        
        System.out.println("Enter temperature in degree Fahrenheit: ");
        f = sc.nextDouble();
        
        c = (f-32)/1.8;
        
        System.out.printf("Temperature in Celsius is: %.2f", c);
                
                
        
        
    }
}
