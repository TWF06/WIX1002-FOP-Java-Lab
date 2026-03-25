package l6;
public class L6Q6 {
    public static boolean isPrime (int num){
        for (int i =2;i<num; i++){
            if (num%i ==0)
                return false;
        }
        return true;
    }
    
    public static int reverse (int num){
        int rev =0;
        while (num!=0){
            int temp = num%10;
            num /= 10;
            rev = rev*10 +temp;
        } 
        return rev;
    }
    
    public static boolean palinPrime(int num){
        return ((isPrime(num))&&(num == reverse(num)));
    }
    
    public static boolean emirp(int num){
        return ((isPrime(num))&&(isPrime(reverse(num)))&&(num != reverse(num)));
    }
    
    public static void main (String[]args){
        //palinprime
        System.out.println("20 palindromic primes:");
        int countPP = 0;
        int num =2;
        while(countPP<20){
            if(palinPrime(num)){
                System.out.println(num);
                countPP++;
            }
            num++;
        }
        
        //emirp
        System.out.println("20 emirp:");
        int countEm=0;
        num = 2;
        while(countEm<20){
            if(emirp(num)){
                System.out.println(num);
                countEm++;
            }
            num++;
        }
    }
}
