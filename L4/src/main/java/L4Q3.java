import java.util.Scanner;

public class L4Q3 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int usermark, count=0, sum=0, sumsquare=0, max=0, min=999999999;
        
        
        while (true){
        System.out.print("Enter a score [negative score to quit]:");
        usermark = sc.nextInt();
        
        if (usermark>=0){
            sum = sum + usermark;
            sumsquare = sumsquare + usermark*usermark;
            count = count +1;
        }
        else
            break;

        if (usermark>max)
            max=usermark;
        
        if (usermark<min)
            min= usermark;
        }
        
        
        double avg = sum/count;
        double sd = Math.sqrt((((sumsquare)-(sum*sum/count)))/(count-1));
        
        System.out.println("Minimum Score: "+min);
        System.out.println("Maximum Score: "+max);
        System.out.println("Average Score: "+avg);
        System.out.printf("Standard deviation: %.2f"+sd);
    }
}
