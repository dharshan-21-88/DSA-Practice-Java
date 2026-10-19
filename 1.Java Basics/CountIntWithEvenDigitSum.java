//https://leetcode.com/problems/count-integers-with-even-digit-sum/
public class CountIntWithEvenDigitSum{
    public static void main(String[] args) {
        System.out.println(countEven(4));
    }

    static int countEven(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            int sum = 0;
            int dig = i;
            while (dig > 0) {
                sum += dig % 10;
                dig /= 10;
            }

            if (sum % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}