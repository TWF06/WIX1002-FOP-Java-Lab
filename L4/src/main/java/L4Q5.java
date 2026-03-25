
public class L4Q5 {
    public static void main(String[]args){
       int rollA, rollB, sumA = 0, sumB = 0;
       
       outerloop: 
       while (true){
           rollA = (int)(Math.random()*(6-1+1)+1);
           System.out.println("Roll A:"+rollA);
           sumA=sumA+rollA;
           loopA:
           while (rollA==6){

               rollA = (int)(Math.random()*(6-1+1)+1);
               System.out.println("Roll A:"+rollA);
               sumA=sumA+rollA;}

           
           rollB = (int)(Math.random()*(6-1+1)+1);
           System.out.println("Roll B: "+rollB);
           sumB=sumB+rollB;
           loopB:
           while(rollB==6){
           
               rollB = (int)(Math.random()*(6-1+1)+1);
               System.out.println("Roll B:"+rollB);
               sumB=sumB+rollB;}
           
           
           
           if (sumA>100){
               System.out.println("Winner is Player A, point:" + sumA +"\nPlayer B, point:" +sumB);
               break outerloop;
           }
           else if (sumB>100){
               System.out.println("Winner is Player B, point:" + sumB +"\nPlayer A, point:" +sumA);
               break outerloop;
           }
       }
    }
}
