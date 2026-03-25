package fop.l8q1;

public class Number {
    public int []Num;
    Number(){
        Num= new int[10];
        for(int i =0 ;i<10;i++){
            Num[i]=(int)(Math.random()*101);
        }
    }
    
    Number(int a){
        Num = new int[a];
        for(int i =0 ;i<a;i++){
            Num[i]=(int)(Math.random()*101);
        }
    }
    
    Number(int a, int b){
        Num = new int[a];
        for(int i =0 ;i<a;i++){
            Num[i]=(int)(Math.random()*(b+1));
        }
    }
    
    void displayAll(){
        System.out.println("Display all: ");
        for(int i = 0 ;i<Num.length;i++){
            System.out.println(Num[i]);
        }
    }
    
    void displayEven(){
        System.out.println("Display even number: ");
        for(int i = 0 ;i<Num.length;i++){
            if(Num[i]%2==0)
                System.out.println(Num[i]);
        }
    }
    
    void displayPrime(){
        System.out.println("Display prime number: ");
        outer:
        for(int i = 0 ;i<Num.length;i++){
            if(Num[i]==2)
                System.out.println(Num[i]);
            else {
                for (int j= 2 ;j*j<=Num[i]; j++){
                    if (Num[i]%j==0 || Num[i]<=1)
                        continue outer;
                }
                System.out.println(Num[i]);
            }
        }
    }
    
    void displayMax(){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<Num.length;i++){
            if (Num[i]>max)
                max=Num[i];
        }
        System.out.println("Max : "+max);
    }
    
    void displayMin(){
        int min=Integer.MAX_VALUE;
        for(int i=0; i<Num.length;i++){
            if (Num[i]<min)
                min=Num[i];
        }
        System.out.println("Min : "+min);
    }
}
