import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int limit = Math.min(a,b);
        int largest = 0;
        for (int i = 1; i <= limit; i++) {
            if(a%i == 0 && b%i==0){
                largest = i; 
            }            
        }
        System.out.println(largest);
        in.close();
    }
}
