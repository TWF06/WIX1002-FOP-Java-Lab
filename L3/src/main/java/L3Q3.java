import java.util.Scanner;
public class L3Q3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sales Volume: ");
        double salesVol = sc.nextDouble();
        
        if (salesVol <= 100)
            System.out.printf("Commission is : %.2f" ,(salesVol * 0.05));
        else if (salesVol > 100 && salesVol <= 500)
            System.out.printf("Commission is : %.2f" ,(salesVol * 0.075));
        else if (salesVol > 500 && salesVol <= 1000)
            System.out.printf("Commission is : %.2f" ,(salesVol * 0.1));
        else
            System.out.printf("Commission is : %.2f" ,(salesVol * 0.125));
                
             
    }
}
