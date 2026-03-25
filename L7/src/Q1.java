import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class Q1 {
    public static void main(String[]args){
        String fileName = "coursename.dat";
        try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName))){
            output.writeUTF("Programming I");
            output.writeUTF("Data Structure");
            output.writeUTF("Operating System");
            output.writeUTF("Computing Mathematics I");
        }catch(IOException e){
            System.out.println("IOException !");
        }
        
        
        System.out.println("Enter course code: ");
        Scanner SC = new Scanner (System.in);
        String courseCode = SC.next();
        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName))){
            if (courseCode.equals("WXES1116")){
                String course = input.readUTF();
                System.out.println(course);
            }
            else if (courseCode.equals("WXES1115")){
                input.readUTF();
                String course = input.readUTF();
                System.out.println(course);
            }
            else if (courseCode.equals("WXES1110")){
                input.readUTF();
                input.readUTF();
                String course = input.readUTF();
                System.out.println(course);
            }
            else if (courseCode.equals("WXES1112")){
                input.readUTF();
                input.readUTF();
                input.readUTF();
                String course = input.readUTF();
                System.out.println(course);
            }
            else{
                System.out.println("Invalid.");
            }
        }catch(IOException e){
            System.out.println("IOException !");
        }
    }
}
