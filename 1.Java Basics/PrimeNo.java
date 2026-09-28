import java.util.*;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = in.nextInt();
        isPrime(num);
        in.close();
    }
    static void isPrime(int num){
        if(num<2){
            System.out.println("Not a prime number");
            return;
        }
        int count = 0;
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0){
                count++;
            }
        }
        if (count == 0){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}
