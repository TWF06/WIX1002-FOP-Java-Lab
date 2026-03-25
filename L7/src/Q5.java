
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;


public class Q5 {
    public static void main(String []args){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("lab07\\person.dat"))){
            int size = ois.readInt();
            String name[] = new String[size];
            int age[] = new int[size];
            char gender[] = new char[size];
            for(int i=0;i<size;i++){
                name[i] = ois.readUTF();
                age[i] = ois.readInt();
                gender[i] = ois.readChar();
            }
            for(int i=0;i<size-1;i++){
                for(int j=0;j<size-1;j++){
                    if(name[j].compareTo(name[j+1])>0){
                        String temp = name[j];
                        int t = age[j];
                        char c = gender[j];
                        name[j] = name[j+1];
                        age[j] = age[j+1];
                        gender[j] = gender[j+1];
                        name[j+1] = temp;
                        age[j+1] = t;
                        gender[j+1]=c;
                    }
                }
            }
            for(int i=0;i<size;i++){
                System.out.print(name[i]+" ");
                System.out.print(age[i]+" ");
                System.out.print(gender[i]+" ");
                System.out.println();
            }
        }catch(FileNotFoundException e){
            System.out.println("FileNotFoundException");
        }catch(IOException e){
            System.out.println("IOException");
        }
    }
}
