package L10Q1;

public class Permanent extends Staff{
    private char cat;
    
    public Permanent(String name, String type, char cat){
        super(name,type);
        //super.set(name, type);
        this.cat = cat;
    }
    
    @Override
    public double salary(){
        if (cat=='A')
            return salary = 4000;
        else if (cat=='B')
            return salary = 3000;
        else if (cat == 'C')
            return salary = 2000;
        return salary = 0;
    }
}
