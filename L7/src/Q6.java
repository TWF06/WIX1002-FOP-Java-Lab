
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Q6 {
    public static void main(String[]args){
        int sizeP=0, sizeO=0;
        try(
            BufferedReader br1 = new BufferedReader(new FileReader("Lab07\\product.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("Lab07\\order.txt"));
        ){
            String str;
            while((str=br1.readLine())!= null){
                sizeP++;
            }
            while((str=br2.readLine())!= null){
                sizeO++;
            }
            br1.close();
            br2.close();
        }catch(IOException e){
            System.out.println("IOException");
        }
        
        String [] pProductID = new String[sizeP];
        String [] pProductName = new String[sizeP];
        double [] pProductPrice = new double[sizeP];
        
        String [] oOrderID = new String[sizeO];
        String [] oProductID = new String[sizeO];
        int [] oOrderQuantity = new int[sizeO];
        
        try(
            BufferedReader br1 = new BufferedReader(new FileReader("Lab07\\product.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("Lab07\\order.txt"));
        ){
            String str;
            int counter=0;
            while((str=br1.readLine())!= null){
                String []temp = str.split(",");
                pProductID[counter] = temp[0];
                pProductName[counter] = temp[1];
                pProductPrice[counter] = Double.parseDouble(temp[2]);
                counter++;
            }
            counter=0;
            while((str=br2.readLine())!= null){
                String []temp = str.split(",");
                oOrderID[counter] = temp[0];
                oProductID[counter] = temp[1];
                oOrderQuantity[counter] = Integer.parseInt(temp[2]);
                counter++;
            }
            br1.close();
            br2.close();
        }catch(IOException e){
            System.out.println("IOException");
        }
        
        System.out.println("ProductID \t ProductName \t Quantity \t PricePerUnit \t Total");

        for(int i=0;i<oProductID.length;i++){
            int indexlink=-1;
            for (int j=0;j<pProductID.length;j++){
                if(oProductID[i].equals(pProductID[j])){
                    indexlink=j;
                }
            }   
            double total=oOrderQuantity[i]*pProductPrice[indexlink];
            System.out.printf("%-10s %-20s  %5d %15.2f %13.2f\n",oProductID[i],pProductName[indexlink],oOrderQuantity[i],pProductPrice[indexlink],total);
        }
    }
}
