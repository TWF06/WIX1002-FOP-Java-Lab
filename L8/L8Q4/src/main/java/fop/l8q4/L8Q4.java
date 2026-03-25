package fop.l8q4;

import java.util.Scanner;

public class L8Q4 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Numerator: ");
        int nume = sc.nextInt();
        System.out.println("Enter Denominator: ");
        int deno = sc.nextInt();
        Fraction f= new Fraction();
        f.input(nume, deno);
        
        f.Output();
    }
}
