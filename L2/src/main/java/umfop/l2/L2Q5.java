package umfop.l2;

public class L2Q5 {
    public static void main(String[]args){
        int rand = (int)(Math.random()*10001);
        System.out.println("Random number is: " + rand);
        
        int temp, sum=0 ;
        while(rand>0){
            temp = rand%10;
            sum = sum + temp;
            rand = rand/10;
        }
        
        System.out.println("Sum is: " + sum);
    }
}
