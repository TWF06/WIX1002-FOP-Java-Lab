package L10Q1;

public class Contract extends Staff{
    private double monthInc;
    private double totalSales, commission;
    
    public Contract(String name, String type, double totalSales){
        super(name, type);
        this.monthInc = 500;
        this.totalSales=totalSales;
        this.commission=0.5*totalSales;
    }
    
    @Override
    public double salary(){
        return salary = monthInc+commission;
    }
}
