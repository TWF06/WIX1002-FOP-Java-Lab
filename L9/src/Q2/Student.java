package Q2;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Student extends PersonProfile{
    public String[] courseName = new String[5], courseCode= new String[5];
    public String[] sem= new String[5], session= new String[5], marks= new String[5];
    public String fileName;
    
    public Student(String name, String gender,String dateBirth,String fileName){
        super(name,gender,dateBirth);
        try{
            BufferedReader br=new BufferedReader(new FileReader(fileName));
            String a;
            int i=0;
            while((a=br.readLine())!= null){
                courseCode[i]=a;
                courseName[i]=br.readLine();
                session[i]=br.readLine();
                sem[i]=br.readLine();
                marks[i]=br.readLine();
                i++;
            }
            br.close();
        }catch(IOException e){
            System.out.println("Error with file.");
        }
    }
    
    public void getGrade(){
        dispProf();
        for(int i =0;i<courseCode.length;i++){
            System.out.println("Course Code: "+courseCode[i]);
            System.out.println("Course Name: "+courseName[i]);
            System.out.println("Session: "+session[i]);
            System.out.println("Semester: "+sem[i]);
            System.out.println("Marks: "+marks[i]);
            int m = Integer.parseInt(marks[i]);
            if (m>=85){
                System.out.println("Grade: A");
            }
            else if (m>=75){
                System.out.println("Grade: A-");
            }   
            else if (m>=70){
                System.out.println("Grade: B+");
            }  
            else if (m>65){
                System.out.println("Grade: B");
            }  
            else if (m>=60){
                System.out.println("Grade: B-");
            }  
            else if (m>=55){
                System.out.println("Grade: C+");
            }  
            else if (m>=50){
                System.out.println("Grade: C");
            }  
            else if (m>=45){
                System.out.println("Grade: D");
            }  
            else if (m>=35){
                System.out.println("Grade: E");
            }  
            else {
                System.out.println("Grade: F");
            }  
        }
    }
    
    
}
