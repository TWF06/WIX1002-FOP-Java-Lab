package fop.l8q2;

public class BankAccount {
    String name, ICpassport;
    double depositAmt,currentAmt;
    
    BankAccount(String name, String ICpassport, double depositAmt){
        currentAmt=0;
        this.name= name;
        this.ICpassport= ICpassport;
        this.depositAmt=depositAmt;
    }
    
    void deposit(double a){
        currentAmt+=depositAmt;
    }
    
    void withdraw(double a){
        currentAmt-=a;
    }
    
    void display (){
        System.out.println("Account holder: "+ name);
        System.out.println("IC/Passport: "+ ICpassport);
        System.out.println("Current balance: "+ currentAmt);
    }
    
    
}
