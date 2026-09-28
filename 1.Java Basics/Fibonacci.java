import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int count = 2;
        int n = in.nextInt();
        in.close();
        
        if (n == 0) {
            System.out.println(0);
            return;
        }
       
        while (count<=n){
            int temp = b;
            b = a+ b;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
