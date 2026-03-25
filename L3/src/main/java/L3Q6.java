import java.util.Scanner;
public class L3Q6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
    
        System.out.println("Enter the radius of circle");
        double radius=sc.nextDouble();
        
        System.out.println("Enter coordinate to check: x:");
        int x=sc.nextInt();
        System.out.println("Enter coordinate to check: y:");
        int y=sc.nextInt();
        
        double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        
        if (distance<=radius)
            System.out.println("In circle");
        else
            System.out.println("Out of circle");
        
    }
}
