import java.util.Scanner;
public class L5Q6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal triangle to generate: ");
        int row = sc.nextInt();
        
        System.out.println("The pascal Triangle with " + row + "row(s)");
        
        int [][]PT = new int[row][row];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    PT[i][j] = 1;
                } 
                else {
                    PT[i][j] = PT[i-1][j-1] + PT[i - 1][j];
                }
            }
        }
        
        for(int i =0 ; i<row ; i++){
            for(int j=0 ; j<row; j++){
                System.out.printf("%-3d",PT[i][j]);
            }
            System.out.println("");
        }
        
        
    }
}
