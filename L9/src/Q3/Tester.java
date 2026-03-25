package Q3;

public class Tester {
    public static void main(String[]args){
        Lecturer jack = new Lecturer("Jack","Male","06/01/2006");
        System.out.println("Before compute ");
        jack.dispAll();
        
        System.out.println("After compute \n\n");
        jack.computeCH();
        jack.dispAll();
    }
}
