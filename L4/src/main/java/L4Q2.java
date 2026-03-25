import java.util.Scanner;
public class L4Q2 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    
    int sum=0, temp=0;
    for (int i = 1; i<=number; i++){
        for (int j = 1; j<=i; j++){
            temp = temp+j;
        }
        sum = sum + temp;
        temp = 0;
    }
    
    System.out.print("Sum is: "+sum);
    }
}
