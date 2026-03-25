import java.util.Scanner;
public class L3Q5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cramer's rule \nax+by=e \ncx+dy=f");
        System.out.println("Enter 6 numbers a,b,c,d,e,f :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        
        int temp = (a*d)-(b*c);
        
        if (temp == 0)
            System.out.println("The equation has no solution");
        else{
            double x =(e*d-b*f)/temp;
            double y =(a*f-e*c)/temp;
            System.out.println("x is "+x);
            System.out.println("y is "+y);
        }
    }
}
