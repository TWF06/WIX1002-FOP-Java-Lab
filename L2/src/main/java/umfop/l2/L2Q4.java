package umfop.l2;

import java.util.Scanner;

public class L2Q4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds:");
        int seconds = sc.nextInt();
        
        int secondsBalance = seconds%60;
        int minutesBalance = (seconds/60)%60;
        int hourBalance = (seconds/3600);
        
        System.out.print(seconds +" seconds is " + hourBalance +" hours, " + minutesBalance + " minutes and " + secondsBalance + "seconds");
}
}
