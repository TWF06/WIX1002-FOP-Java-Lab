package l6;
public class L6Q4 {
    public static int gcd (int a ,int b){
        while (b!=0){
        int temp = b;
        b= a%b;
        a= temp;
        }
        return a;
    }
    
    public static void main(String[]args){
        System.out.println("24 and 8");
        System.out.println((int)gcd(24,8));
        System.out.println("200 and 625");
        System.out.println((int)gcd(200,625));
    }
}
