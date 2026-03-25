package umfop.l2;
import java.util.Scanner;
public class L2Q6 {
    static double convertingFtoC(double f){
        double c = (f-32)/1.8;
        return c;
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of water in gram: ");
        double M = sc.nextDouble()/1000;
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double fi = convertingFtoC(sc.nextDouble());
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double ff = convertingFtoC(sc.nextDouble());
        
        
        double Q = M * (ff - fi) * 4184;
        System.out.printf("The energy needed is %e%n",Q);
          
    }
    
}
