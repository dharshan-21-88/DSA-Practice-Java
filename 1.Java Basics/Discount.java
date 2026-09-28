import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mrp = in.nextInt();
        
        if(mrp<1000){
            System.out.println(mrp);
        }
        else if (mrp<2000){
            System.out.println(mrp-mrp*10/100);
        }        
        else if (mrp<5000){
            System.out.println(mrp-mrp*20/100);
        }
        else{
            System.out.println(mrp-mrp*30/100);
        }
        in.close();
    }
}
