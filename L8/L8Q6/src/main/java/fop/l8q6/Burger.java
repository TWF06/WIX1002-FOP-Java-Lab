package fop.l8q6;

public class Burger {
    private int ID, burgerSold;
    static int total;
    
    Burger(int ID){
        this.ID=ID;
    }
    
    void soldAmount(int sell){
        burgerSold+=sell;
        System.out.println("Current burger sold for this store: "+burgerSold);
        total+=sell;
    }
    
    void currentStall(){
        System.out.println("For stall "+ID+", total burger sold: "+ burgerSold);
    }
            
    static void allStall(){
        System.out.println("For all stall, total burger sold: "+total);
    }
    
}
