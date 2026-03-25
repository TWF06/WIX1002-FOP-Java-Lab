import java.util.Scanner;
public class L4Q7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter principal amount: ");
        double P = sc.nextDouble();
        
        System.out.print("Enter interest in %: ");
        double i = sc.nextDouble();
        
        System.out.print("Enter total amount of month(s): ");
        double N = sc.nextDouble();
        
        double M = (P*(i/(1200)))/(1-Math.pow((1+(i/(12*100))),(-1*N)));
        
        System.out.println();
        System.out.printf("%-5s %-15s %-12s %-12s %-15s %-12s%n",
                "Month", "MonthlyPayment", "Principal(Cn)", "Interest(Ln)", "UnpaidBalance(Rn)", "TotalInterest");

        double Rn = P; 
        double totalInterest = 0.0;

        for (int n = 1; n <= N; n++) {
            
            double Ln = Rn * (i/(12*100));
            double Cn = M - Ln;

            
            Rn = Rn - Cn;
            if (Rn < 1e-10) Rn = 0.0; 

            totalInterest += Ln;

            System.out.printf("%-5d %-15.2f %-12.2f %-12.2f %-15.2f %-12.2f%n",
                    n, M, Cn, Ln, Rn, totalInterest);
        }
    }
}
