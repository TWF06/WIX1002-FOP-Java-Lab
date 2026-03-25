package l6;
public class L6Q3 {
    public static void reverseArray(int [] numset){
        for (int i = 0; i<numset.length; i++){
            String temp = Integer.toString(numset[i]);
            for (int j=temp.length()-1;j>=0 ;j-- ){
                System.out.print(temp.charAt(j));
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[]args){
        int [] numset = new int[10];
        
        for (int i = 0; i<numset.length; i++){
            int rand = (int)(Math.random()*(9000)+1000);
            numset[i] = rand;
        }
        
        System.out.println("Original Random Set:");
        for (int test : numset){
            System.out.println(test);
        }   
        
        System.out.println("After Switch Set:");
        reverseArray (numset);
    }
    
    public void m(){
        System.out.println("");
    }
}
