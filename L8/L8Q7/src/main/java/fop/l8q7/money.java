
package fop.l8q7;

public class money {
    private double amount;
    
    money(double a){
        this.amount=rounding(a);
    }
    
    double rounding(double amt){
        double rounded = Math.round(amt/0.05)*0.05;
        System.out.printf("After rounding, RM %.2f \n",rounded);
        return rounded;
    }
    
    void calculateNotesCoins(){
        double remain = amount;
        if (remain<=0){
            System.out.println("No notes or coins.");
        }
        int []notes= {100,50,20,10,5,1};
        int []coins = {50,20,10,5};
        for (int n:notes){
            if(remain>=n){
                int quantity = (int)(remain/n);
                remain = remain%n;
                System.out.println("Notes RM "+n+", "+quantity+" pcs");
                System.out.printf("Remaining RM %.2f \n",remain);
            }
        }
        remain = (int)Math.round(remain*100);
        for (double c:coins){
            if (remain>=c){
                int quantity = (int)(remain/c);
                remain=remain%c;
                System.out.println("Coins RM "+(c/100)+", "+quantity+" pcs");
                System.out.printf("Remaining RM %.2f \n",(remain/100));
            }
        }
        System.out.println();
    }
    
    public money add(money other){
        return new money(this.amount + other.amount);
    }
    
    public money substract(money other){
        return new money(this.amount - other.amount);
    }
    
    double getAmount(){
        return amount;
    }
}
