package fop.l8q3;
import java.util.Scanner;
public class L8Q3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = sc.nextInt();
        System.out.println("Enter your height");
        double height = sc.nextDouble();
        
        WeightCalculator wc= new WeightCalculator();
        wc.input(age, height);
        wc.displayOutput();
    }
}
