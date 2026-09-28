import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f = 1;
        for (int i = n; i >= 1 ; i--) {
            f*= i;
        }
        System.out.println(f);
        in.close();
    }
}