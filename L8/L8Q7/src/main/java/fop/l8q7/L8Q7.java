package fop.l8q7;
public class L8Q7 {

    public static void main(String[] args) {
        money m1 = new money(123.51);
        System.out.println("M1: "+m1.getAmount());
        m1.calculateNotesCoins();
        
        money m2 = new money(456.56);
        System.out.println("M1: "+m2.getAmount());
        m2.calculateNotesCoins();
        
        money m3 = m2.add(m1);
        m3.getAmount();
        m3.calculateNotesCoins();
        
        money m4 = m1.substract(m2);
        m4.getAmount();
        m4.calculateNotesCoins();
    }
}
