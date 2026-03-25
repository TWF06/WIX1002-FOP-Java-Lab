package l6;
import java.util.Scanner;
public class L6Q5 {
    public static boolean compareAssistant(int x, int y, int z){
        if(x*y == z)
            return true;
        else 
            return false;
    }
    
    public static void main (String[]args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Game");
        int score = 0;
        boolean correct;
        
        while (true){
            System.out.println("Enter negative number to quit.");
            int x = (int)(Math.random()*12);
            int y = (int)(Math.random()*12);
            System.out.print(x+" x "+y +" = ");
            int z = sc.nextInt();
            if (z<0)
                break;
            correct = compareAssistant(x,y,z);
            if (correct)
                score++;
        }
        System.out.println("Your Score is "+score);
        
    }
}
