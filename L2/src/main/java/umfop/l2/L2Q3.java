
package umfop.l2;
import java.util.Random;
public class L2Q3 {
    public static void main(String[]args){
        //method 1
        Random rand = new Random();
        int num1 = rand.nextInt(50-10+1)+10;
        System.out.println(num1);
        int num2 = rand.nextInt(50-10+1)+10;
        System.out.println(num2);
        int num3 = rand.nextInt(50-10+1)+10;
        System.out.println(num3);
        
        int sum = num1 + num2 + num3;
        double average = (double)sum / 3.0;
        
        System.out.println("sum: " + sum);
        System.out.printf("average: %.2f%n", average);
        
        //method 2
        int numA = (int)(Math.random()*(50-10+1)) + 10;
        System.out.println(numA);
        int numB = (int)(Math.random()*(50-10+1)) + 10;
        System.out.println(numB);
        int numC = (int)(Math.random()*(50-10+1)) + 10;
        System.out.println(numC);
        
        int sumB = numA+ numB+ numC;
        double averageB = (double)sumB / 3.0;
        
        System.out.println("sum: " + sumB);
        System.out.printf("average: %.2f%n", averageB);
        
        
    
    }
}
