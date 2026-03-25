import java.util.Random;
import java.util.Scanner;
public class L5Q1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Enter number of student, N: ");
        int N = sc.nextInt();
        
        int []score = new int[N];
        int high=-1,low=101,avg,sum=0;
        for (int i=0; i<score.length; i++){
            score[i] = rand.nextInt(101);
            System.out.println("Student " + (i+1) + ":" + score[i]);
            if (score[i]>=high)
                high = score[i];
            else if (score[i]<=low)
                low = score[i];
            sum = sum + score[i];
        }
         
        avg=sum/N;
        for (int i=0; i<score.length; i++){
            if (score[i]==high)
                System.out.println("Highest score is "+ high + " from Student " +(i+1));
            else if (score[i]==low)
                System.out.println("Lowest score is "+ low + " from Student " +(i+1));
        }
        
        System.out.println("Average score is "+ avg);
    }
}
