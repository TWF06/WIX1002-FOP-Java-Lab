import java.util.Random;
public class L4Q6 {
    public static void main(String[]args){
        Random rand = new Random();
        int ranNum = Math.abs(rand.nextInt());
        System.out.println(ranNum);
        
        int Lengt = String.valueOf(ranNum).length();
        System.out.println("The length is:"+Lengt);
        
        
    }
}
