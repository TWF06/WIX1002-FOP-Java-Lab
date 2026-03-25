
public class L3Q4 {
    public static void main(String[]args){
        int dice1A, dice1B, dice2A, dice2B, sum1=0, sum2=0;
        //player1
        System.out.println("Player 1");
        dice1A = (int)(Math.random()*(6-1+1)+1);
        System.out.println("Roll 1 :" + dice1A);
        dice1B = (int)(Math.random()*(6-1+1)+1);
        System.out.println("Roll 2 :" + dice1B);
        sum1 = dice1A + dice1B;
        //player2
        System.out.println("\nPlayer 2");
        dice2A = (int)(Math.random()*(6-1+1)+1);
        System.out.println("Roll 1 :" + dice2A);
        dice2B = (int)(Math.random()*(6-1+1)+1);
        System.out.println("Roll 2 :" + dice2B);
        sum2 = dice2A + dice2B;
        
        //determine winner
        if (sum1 == sum2)
            System.out.println("\nDraw");
        else if (sum1 > sum2)
            System.out.println("\nWinner is player 1");
        else
            System.out.println("\nWinner is player 2");
    
    
    }
}
