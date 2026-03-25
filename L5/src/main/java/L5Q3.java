import java.util.Scanner;
public class L5Q3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of employee: ");
        int N = sc.nextInt();
        int [][]emphours =new int[N][7];
        
        for(int i=0; i<emphours.length;i++){
            for(int j=0; j<emphours[i].length;j++){
                emphours[i][j]=(int)((Math.random()*(8-1+1))+1);
            }                
        }
        
        int a=0;
        while (a<N){
            int sum=0;
            System.out.print("Emp "+ (a+1) +":");
            for(int j=0; j<emphours[a].length;j++){
                System.out.print(emphours[a][j] + "   ");
                sum=sum+emphours[a][j];
                  
            }
            System.out.println("\nSum: "+sum);
            a++;
        }
    }
}
