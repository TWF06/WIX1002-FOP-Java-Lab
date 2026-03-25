package L10Q1;

public class Temporary extends Staff{
    private int workH;
    
    public Temporary(String name, String type, int workH){
        super(name, type);
        this.workH = workH;
    }
    
    @Override
    public double salary(){
        return salary = workH*15;
    }
}
