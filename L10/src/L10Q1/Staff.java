package L10Q1;

public abstract class Staff {
    private String name, type;
    protected double salary;
    
    public Staff(String name, String type){
        this.name=name;
        this.type=type;
    }
    public void set(String name, String type){
        this.name = name;
        this.type = type;
    }
    
    public abstract double salary();
    
    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Type: "+type);
        System.out.println("Salary: "+ salary);
    }
}
