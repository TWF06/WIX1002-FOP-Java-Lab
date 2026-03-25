import java.util.Scanner;
public class L4Q4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = sc.nextInt();
        
        System.out.println("Enter First Day (0 for Sunday, 1 for Monday...6 for Saturday):");
        int day = sc.nextInt();
        if (day >=0 && day <=6){
            if (year % 400 == 0){
                System.out.println(year+" is Leap Year");
                int firstMay = 118%7;
                int firstAug = 210%7;
                
                if (firstMay == 6)
                    firstMay=0;
                if (firstAug == 6)
                    firstAug=0;
                
                System.out.println("May");
                System.out.println("S\tM\tT\tW\tT\tF\tS");
                for(int i = 0; i<=firstMay; i++)
                    System.out.print(" \t");
                for(int i = 1; i<=31; i++){
                    int temp=i+firstMay;
                    if (temp==7 || temp==14 || temp==21 || temp==28 || temp==35)
                        System.out.print("\n");
                    System.out.print(i + "\t");
                }
                
                System.out.println("Aug");
                System.out.println("S\tM\tT\tW\tT\tF\tS");
                for(int i = 0; i<=firstAug; i++)
                    System.out.print(" \t");
                for(int i = 1; i<=31; i++){
                    int temp=i+firstAug;
                    if (temp==7 || temp==14 || temp==21 || temp==28 || temp==35)
                        System.out.print("\n");
                    System.out.print(i + "\t");
                }
            }
            
            else if (year % 4 == 0 && year % 100 != 0){
                System.out.println(year+" is Leap Year");
                int firstMay = 118%7;
                int firstAug = 210%7;
                
                System.out.println("May");
                System.out.println("S\tM\tT\tW\tT\tF\tS");
                for(int i = 0; i<=firstMay; i++)
                    System.out.print(" \t");
                for(int i = 1; i<=31; i++){
                    int temp=i+firstMay;
                    if (temp==7 || temp==14 || temp==21 || temp==28 || temp==35)
                        System.out.print("\n");
                    System.out.print(i + "\t");
                }
                
                System.out.println("\nAug");
                System.out.println("S\tM\tT\tW\tT\tF\tS");
                for(int i = 0; i<=firstAug; i++)
                    System.out.print(" \t");
                for(int i = 1; i<=31; i++){
                    int temp=i+firstAug;
                    if (temp==7 || temp==14 || temp==21 || temp==28)
                        System.out.print("\n");
                    System.out.print(i + "\t");
                }
            }
            
            else{
                System.out.println(year+" is not leap year");
                int firstMay = 122%7;
                int firstAug = 214%7;
                
                System.out.println("May");
                System.out.println("S\tM\tT\tW\tT\tF\tS");
                for(int i = 0; i<=firstMay; i++)
                    System.out.print(" \t");
                for(int i = 1; i<=31; i++){
                    int temp=i+firstMay;
                    if (temp==7 || temp==14 || temp==21 || temp==28)
                        System.out.print("\n");
                    System.out.print(i + "\t");
                }
                
                System.out.println("\nAug");
                System.out.println("S\tM\tT\tW\tT\tF\tS");
                for(int i = 0; i<=firstAug; i++)
                    System.out.print(" \t");
                for(int i = 1; i<=31; i++){
                    int temp=i+firstAug;
                    if (temp==7 || temp==14 || temp==21 || temp==28)
                        System.out.print("\n");
                    System.out.print(i + "\t");
            }
        }
    }
}}
