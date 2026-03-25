package Q3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Lecturer extends PersonProfile {
    public String[] 
            courseName=new String[4], 
            courseCode=new String[4],
            sem=new String[4],
            session=new String[4];
    public double[]
            creditH=new double [4];
    public int[]
            noStu=new int[4];
    
    public Lecturer(String name, String gender,String dateBirth){
        super(name,gender,dateBirth);
        File f = new File("lecturer.txt");
        int i =0;
        try(Scanner sc = new Scanner(f)){
            while (sc.hasNextLine()){
                courseCode[i]=sc.nextLine();
                courseName[i]=sc.nextLine();
                session[i]=sc.nextLine();
                sem[i]=sc.nextLine();
                creditH[i]=Integer.parseInt(sc.nextLine());
                noStu[i]=Integer.parseInt(sc.nextLine());
                i++;
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void computeCH(){
        for(int i=0;i<courseCode.length;i++){
            if(noStu[i]>=150)
                creditH[i]=creditH[i]*3;
            else if(noStu[i]>=100)
                creditH[i]=creditH[i]*2;
            else if(noStu[i]>=50)
                creditH[i]=creditH[i]*1.5;                
        }
    }
    
    public void dispAll(){
        dispProf();
        for(int i=0;i<courseCode.length;i++){
            System.out.println("Course Code: "+courseCode[i]);
            System.out.println("Course Name: "+courseName[i]);
            System.out.println("Session: "+session[i]);
            System.out.println("Semester: "+sem[i]);
            System.out.println("Number of student: "+noStu[i]);
            System.out.println("Credit hour: "+creditH[i]);
        }
    }
            
}
