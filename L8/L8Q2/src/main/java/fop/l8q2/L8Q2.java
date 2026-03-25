package fop.l8q2;
public class L8Q2 {

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Tan", "060106010501", 1500);
        acc1.deposit(200);
        acc1.withdraw(3000);
        acc1.display();
    }
}
