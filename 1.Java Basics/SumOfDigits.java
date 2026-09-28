import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        if(n<0){
            n*=-1;
        }
        while(n!=0){
            int rem = n % 10;
            sum += rem;
            n/=10;
        }
        System.out.println(sum);
        in.close();
    }
}
