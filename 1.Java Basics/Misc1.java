// Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class Misc1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = in.nextInt();
        int result = fun(num);
        System.out.println(result);
        in.close();
    }
    static int fun(int num){
        int prod=1,sum=0;
        while (num!=0){
            int rem = num % 10;
            prod *=rem;
            sum +=rem;
            num/=10; 
        }
        return prod - sum;  
    }
}
