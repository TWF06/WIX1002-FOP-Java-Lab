package fop.l8q5;

public class L8Q5 {

    public static void main(String[] args) {
        Game p1 = new Game("MX");
        Game p2 = new Game("WF");
        int sumP1=0,sumP2=0;
        int round=1;
        while (true){
            System.out.println("Round"+round);
            sumP1 += p1.dice();
            sumP2 += p2.dice();
            if (sumP1>sumP2 && sumP1>100){
                p1.displayWinner(sumP1);
                break;
            }
            else if(sumP2>sumP1 && sumP2>100){
                p2.displayWinner(sumP2);
                break;
            }
            round++;
        }
    }
}
