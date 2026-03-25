import java.util.Random;
import java.util.Scanner;
public class L5Q5 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        Random rand= new Random();
        int []random = new int[20];
        
        System.out.println("A list of 20 random integer within 0 to 100");
        for(int i=0; i<random.length;i++){
            random[i]= rand.nextInt(101);
            System.out.print(random[i]);
            if (i!=19){
                System.out.print(",");
            }
        }
        
        int temp;
        for(int a=0; a<random.length;a++){
            for(int i=0; i<(random.length-1);i++){
                if(random[i]<=random[i+1]){
                    temp = random[i];
                    random[i]=random[i+1];
                    random[i+1]= temp;
                }
            }
        }
        
        System.out.println("\nArray in descending order");
        for(int i=0; i<random.length;i++){
            System.out.print(random[i]);
            if (i!=19){
                System.out.print(",");
            }
        }
        
        System.out.print("\nEnter a number to search: ");
        int target = sc.nextInt();
        
        outerloop:
        while(true){
            for(int i=0; i<random.length;i++){
                if (random[i]==target){
                    System.out.println(target + " found");
                    System.out.println("Linear Search - " + i + " loop(s)");
                    break outerloop;
                }
            }
            System.out.println(target + " not found");
            break;
        }
        
        int low = 0;
        int high = 19;
        int mid;
        int ind=-1;
        int count=0;
        
        while (low<=high){
            mid = (low+high)/2;
            if (target==random[mid]){
                ind=mid;
                break;
            }
            else if(target<random[mid]){
                low=mid+1;
                count++;
            }
            else{
                high=mid-1;
                count++;
            }
        }
        
        if(ind == -1)
            System.out.println(target + " not found");
        else
            System.out.println(target + " found\nBinary Search - " + count + " loop(s)");
    }
}
