package Q4;

public class GameB extends GameA{
    
    @Override
    public boolean win(int sum){
        if(sum==100)
            return true;
        else
            return false;
    }
    
    @Override
    public int rollA(){
        int first = rollDice();
        System.out.println("First roll "+ first);
        int second=0;
        if (first == 6){
            second = rollDice();
            if (second == 6){
                System.out.println("Second roll "+ second);
                System.out.println("Total roll 0");
                return 0;
            }
            else{
                System.out.println("Second roll "+ second);
                System.out.println("Total roll "+ (first+second));
                return first+second;
            }
        }
        else {
            System.out.println("Total roll "+ (first+second));
            return first;
        }
    }
    
}
