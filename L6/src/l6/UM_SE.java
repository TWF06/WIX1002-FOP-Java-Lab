package l6;

public class UM_SE {
    public void SA(){
        System.out.println("The lecturer for FOP is Dr Hema");
    }
    public void ML(){
        System.out.println("The lecturer for FOP is Dr Jawid");
    }
    public void FOP(){
        UM_IS is = new UM_IS();
        is.FOP();
    }
    public void Math(){
        UM_IS.Math();
        
        UM_IS is = new UM_IS();
        is.Math();
    }
    public static void main(String[]args){
        UM_IS.Math();
        UM_SE se = new UM_SE();
        se.Math();
        String A= "123";
        String B= "234";
        System.out.print(A+B);
    }
}
