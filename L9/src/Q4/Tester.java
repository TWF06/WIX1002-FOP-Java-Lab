package Q4;

public class Tester {
    public static void main (String [] args){
        //game A
        GameA p1 = new GameA();
        GameA p2 = new GameA();
        int sum1=0,sum2=0,round=1;
    
        while(true){
            System.out.println("\nRound "+round);
            System.out.println("Player 1");
            sum1+=p1.rollA();
            System.out.println("Sum Player 1 "+sum1);
            System.out.println("Player 2");
            sum2+=p2.rollA();
            System.out.println("Sum Player 2 "+sum2);
            if(p1.win(sum1)&&p2.win(sum2)){
                System.out.println("Draw");
                break;
            }
            else if (p1.win(sum1)){
                System.out.println("Player 1 wins");
                break;
            }
            else if(p2.win(sum2)){
                System.out.println("Player 2 wins");
                break;
            }
            round++;
        }
        System.out.println();
        System.out.println();
        
        //game B
        GameB p3 = new GameB();
        GameB p4 = new GameB();
        int sum3=0,sum4=0,temp;round=1;
        
        while(true){
            System.out.println("\nRound "+round);
            System.out.println("Player 3");
            temp = p3.rollA();
            if(temp+sum3<=100){
                sum3+=temp;
            }
            System.out.println("Sum Player 3 "+sum3);
            System.out.println("Player 4");
            temp = p4.rollA();
            if(temp+sum4<=100){
                sum4+=temp;
            }
            System.out.println("Sum Player 4 "+sum4);
            if(p3.win(sum3)&&p4.win(sum4)){
                System.out.println("Draw");
                break;
            }
            else if (p3.win(sum3)){
                System.out.println("Player 3 wins");
                break;
            }
            else if(p4.win(sum4)){
                System.out.println("Player 4 wins");
                break;
            }
            round++;
        }
    }
}
