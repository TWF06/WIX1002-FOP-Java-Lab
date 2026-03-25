import java.util.Scanner;

public class L4Q1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an Integer: ");
        int number = sc.nextInt();
        
        System.out.print("The factors are: ");
        if (number != 0){
            for (int i=1; i<=number; i++){
                if (number % i == 0)
                    System.out.print(i + ", ");
            }
        }
    }            
}
