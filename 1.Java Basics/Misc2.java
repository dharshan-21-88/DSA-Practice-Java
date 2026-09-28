// Input a number and print all the factors of that number (use loops)

import java.util.Scanner;

public class Misc2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = in.nextInt();

        for (int i = 0; i <=n; i++) {
            if(n % i==0){
                System.out.println(i);
            }
        }
        in.close();
    }
}
