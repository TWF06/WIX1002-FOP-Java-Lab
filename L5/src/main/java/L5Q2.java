
public class L5Q2 {
    public static void main(String[]args){
        int numbers[] = new int[10];
        int num, count=0;
        boolean duplicate = false;
        
        System.out.print("Random numbers: ");
        outerloop:
        while(count <numbers.length){
            num = (int)(Math.random()*20);
            
            for (int j=0; j<count; j++){
                if(num==numbers[j]){
                    duplicate = true;
                    break;
                }
            }
            
            if (duplicate == false){
                numbers[count]=num;
                System.out.print(numbers[count] + "\t");
                count++;
            }
        }
        
        
    }
}
