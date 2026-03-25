import java.util.Scanner;
public class L3Q1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("Enter the operand: ");
        String S1 = sc.next();
        char Charac =S1.charAt(0);
        
        if (Charac == '+')
            System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        else if (Charac == '-')
            System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        else if (Charac == '*')
            System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        else if (Charac == '/')
            if (num2 != 0)
                System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
            else
                System.out.println("Error ! Division by 0");
        //else if (Charac == '%')
        //    System.out.println(num1 + " % " + num2 + " = " + (num1%num2)); 
        else
            System.out.println("Invalid operand");
        
    }
}
