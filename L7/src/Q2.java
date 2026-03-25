import java.io.FileOutputStream;
import java.util.Scanner; 
import java.net.URL; 
import java.io.InputStream; 
import java.net.URLConnection;
import java.io.IOException;
import java.io.PrintWriter;
public class Q2 {
    public static void main(String[]args){
        try {
            URL u = new URL("https://en.wikipedia.org/wiki/Donald_Trump"); 
            URLConnection cnn = u.openConnection(); 
            cnn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");
            InputStream stream = cnn.getInputStream(); 
            Scanner in = new Scanner(stream); 
            String fileName= "index.htm";
            PrintWriter pw =  new PrintWriter(new FileOutputStream(fileName));
            
            while(in.hasNextLine()){
                String line = in.nextLine();
                pw.println(line);
            }
            
            pw.close();
            in.close();
        } catch (IOException e) { 
            System.out.println("IO Error:" + e.getMessage()); 
        }
    }
}
