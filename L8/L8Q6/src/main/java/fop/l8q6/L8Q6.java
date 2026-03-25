package fop.l8q6;

import java.util.Scanner;

public class L8Q6 {

    public static void main(String[] args) {
        Burger stall1 = new Burger(1);
        stall1.soldAmount(20);
        stall1.currentStall();
        
        Burger stall2 = new Burger(2);
        stall2.soldAmount(30);
        stall2.currentStall();
        
        Burger.allStall();
        
        
    }
}
