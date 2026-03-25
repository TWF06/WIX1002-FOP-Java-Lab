
package umfop.l2;
import java.util.Scanner;
public class L2Q2 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        double P,D,R,Y,M;
        
        System.out.println("Enter the price of car: ");
        P = sc.nextDouble();
        System.out.println("Enter the down payment: ");
        D = sc.nextDouble();
        System.out.println("Enter the rate in %: ");
        R = sc.nextDouble();
        System.out.println("Enter the loan duration in year: ");
        Y = sc.nextDouble();
        
        M = (P-D)*(1+R*Y/100)/(Y*12);
        System.out.printf("The monthly payment of the car is: %.2f" ,M);
    }
}
