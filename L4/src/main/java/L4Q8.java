
public class L4Q8 {
    public static void main(String[]args){
        int n = (int)(Math.random()*(101));
        
        System.out.println("The random num is : "+n);
        System.out.print("The first n prime number are: ");
        System.out.print("2,");
        
        for(int i=2,num=3; i<=n ;num+=2){
            if (num%2!=0)
                for(int j = 3; j<=num;j++)
                    if (num==j){
                        i++;
                        System.out.print(num+",");
                    }
                    else if (num%j==0)
                        break;
            
        }
    }
}
