package L10Q1;

public class Test {
    public static void main(String[]args){
        Staff p = new Permanent("Ali", "Permanant", 'A');
        Staff c = new Contract("Ahmad", "Contract", 30000.00);
        Staff t = new Temporary("Abu", "Temporary", 250);
        
        p.salary();
        p.displayInfo();
        
        c.salary();
        c.displayInfo();
        
        t.salary();
        t.displayInfo();
    }
}
