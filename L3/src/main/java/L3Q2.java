
public class L3Q2 {
    public static void main(String[]args){
        int Rand = (int)(Math.random()*(5-0+1)+0);
        //System.out.println(Rand); //to check in range or not
        if (Rand == 0)
            System.out.println(Rand + " is zero.");
        else if (Rand == 1)
            System.out.println(Rand + " is one.");
        else if (Rand == 2)
            System.out.println(Rand + " is two.");
        else if (Rand == 3)
            System.out.println(Rand + " is three.");
        else if (Rand == 4)
            System.out.println(Rand + " is four.");
        else if (Rand == 5)
            System.out.println(Rand + " is five.");
    }
}
