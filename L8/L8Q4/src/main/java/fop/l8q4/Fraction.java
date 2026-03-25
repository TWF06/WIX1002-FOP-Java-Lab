package fop.l8q4;
public class Fraction {
    int numerator, denominator;
    
    void input(int a, int b){
        setNumerator(a);
        setDenominator(b);
    }
    
    void setNumerator(int a){
        this.numerator=a;
    }
    
    void setDenominator(int a){
        this.denominator= a;
    }
    
    int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    void Output(){
        int gcd = getGCD(numerator, denominator);
        System.out.print("The lowest term fraction is "+ (numerator/gcd)+"/"+(denominator/gcd));
    }
}
