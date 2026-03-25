package l6;
public class L6Q2 {
    public static void multiPrint (int n , char c){
        for (int i = n ; i>0 ; i--)
            System.out.print(c);
    }
    
    public static void main (String[]args){
        //initialize height of shapes
        int size=5; 
        
        //triangle (right angle triangle)
        for (int i = 1; i<=size ; i++){
            multiPrint(i, '*');
            System.out.println();
        }
        
        System.out.println();
        
        //triangle (equilateral)
        for (int i = 1; i<=size ; i+=2){
            int temp = ((size - i)/2);
            multiPrint(temp,' ');
            multiPrint(i,'#');
            multiPrint(temp,' ');
            System.out.println();
        }
        
        System.out.println();
        
        //diamond
        for (int i = 1; i<=size ; i+=2){
            int temp = ((size - i)/2);
            multiPrint(temp,' ');
            multiPrint(i,'*');
            multiPrint(temp,' ');
            System.out.println();
        }
        for (int i = size-2; i>0 ; i-=2){
            int temp = ((size - i)/2);
            multiPrint(temp,' ');
            multiPrint(i,'*');
            multiPrint(temp,' ');
            System.out.println();
        }
    }
}
