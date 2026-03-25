package Q3;

public class PersonProfile {
    public String name,gender,dateBirth;
    
    public PersonProfile(String name, String gender,String dateBirth){
        this.name=name;
        this.gender=gender;
        this.dateBirth=dateBirth;
    }
    
    public void dispProf(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Date of Birth: "+dateBirth);
    }
}
