
public class L5Q4 {
    public static void main(String[]args){
        System.out.println("3 by 3 Matrix");
        int [][]matrix =new int[3][3];
        
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[i].length;j++){
                matrix[i][j]=(int)((Math.random()*(8-1+1))+1);
                System.out.printf("%-3d",matrix[i][j]);
            }                
            System.out.println("");
        }

        int temp;
        temp = matrix[0][0];
        matrix[0][0]=matrix[2][0];
        matrix[2][0]=matrix[2][2];
        matrix[2][2]=matrix[0][2];
        matrix[0][2]=temp;
        temp=matrix[0][1];
        matrix[0][1]=matrix[1][0];
        matrix[1][0]=matrix[2][1];
        matrix[2][1]=matrix[1][2];
        matrix[1][2]=temp;
        
        System.out.println("After rotates 90 degrees clockwise");
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[i].length;j++){
                System.out.printf("%-3d",matrix[i][j]);
            }                
            System.out.println("");
        }
        
    }
}
