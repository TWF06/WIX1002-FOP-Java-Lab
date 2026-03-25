package fop.l8q5;
import java.util.Random;
public class Game {
    private String name; 
    Game(String a){
        name = a;
    }
    
    int dice(){
        Random r = new Random();
        int roll= (int)(r.nextInt(6-1+1)+1);
        System.out.println("This roll produces "+ roll + " points for "+name);
        return roll;
    }
    
    void displayWinner(int score){
        System.out.println(name +" with "+ score+ " has win the game.");
    }
}
