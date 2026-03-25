package Q1;

public class Tester {
    public static void main (String[]args){
        Rectangle r = new Rectangle();
        r.inputLength(20, 10);
        r.name="Rectangle";
        r.calPeri();
        r.calArea();
        r.display();
        
        Square s = new Square();
        s.inputLength(20);
        s.name="Square";
        s.calPeri();
        s.calArea();
        s.display();
        
        Circle c = new Circle();
        c.inputDiameter(30);
        c.name="Circle";
        c.calPeri();
        c.calArea();
        c.display();
    }
}
