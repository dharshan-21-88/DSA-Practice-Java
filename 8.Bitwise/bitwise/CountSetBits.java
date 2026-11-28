package bitwise;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }

    static int setBits(int n) {
        int count = 0;

        while (n > 0) {
            count++;

            n = n - (n & -n);  // Find the right most set bit logic
        }

        return count;
    }
}