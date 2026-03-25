
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Q3 {
    public static void main (String[]args){
        String fileName= "reverse.txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
            Scanner sc =  new Scanner (System.in);
            System.out.print("Enter initial input (String):");
            String str =  sc.nextLine();
            bw.write(str);
        }catch(IOException e){
            System.out.println("IOException");
        }
        
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String str = br.readLine();
            String opt="";
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
                for(int i = str.length()-1; i>=0; i--){
                    opt = opt+str.charAt(i);
                }
                bw.write(opt);
                System.out.println("Done save " + opt);
            }
        }catch(FileNotFoundException e){
            System.out.println("FileNotFoundException");
        }catch(IOException e){
            System.out.println("IOException");
        }
    }
}
