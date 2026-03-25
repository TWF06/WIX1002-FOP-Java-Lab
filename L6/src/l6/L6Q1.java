package l6;
public class L6Q1 {
    public static int triNum(int n){
        int sum=0;
        for(int i = n ; i > 0 ; i--){
            sum+=i ;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int temp;
        for (int j=1; j<=20; j++){
            temp = triNum(j);
            System.out.println(temp);
            L6Q3 L = new L6Q3();
            L.m();
        }
        
    }
}
