import java.util.Scanner;

public class GCDofOddAndEvenSums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(gcdOfOddEvenSums(n));
    }

    static int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        int gcd = 0;

        for (int i = 1; i <= n * 2; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        int min = Math.min(sumEven, sumOdd);

        for (int j = 1; j * j <= min; j++) {
            if (sumOdd % j == 0 && sumEven % j == 0) {
                if (j > min / j) {
                    gcd = j;
                } else {
                    gcd = min / j;
                }
            }
        }
        return gcd;
    }
}
