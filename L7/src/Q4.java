
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q4 {
    public static void main (String []args){
        try(BufferedReader br = new BufferedReader(new FileReader ("Q4.txt"))){
            String str;
            int counter=1, lineNum = 0, wordNum =0,charNum=0;
            while((str = br.readLine())!=null){
                System.out.println(str);
                lineNum++;
                String[]strArray = str.split(" ");
                for(String a:strArray){
                    wordNum++;
                    charNum = charNum+a.length();
                }
            }
                System.out.println("Number of Lines: "+lineNum);
                System.out.println("Number of Words: "+wordNum);
                System.out.println("Number of Characters (without space): "+charNum);
                System.out.println("Number of Characters (with space): "+(charNum+wordNum-lineNum));
        }catch(IOException e){
            System.out.println("IOException");
        }
    }
}
