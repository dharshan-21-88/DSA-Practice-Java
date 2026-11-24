package bitwise;

public class MagicNumber {
    public static void main(String[] args) {
        System.out.println(magic(6));
    }

    static int magic(int n) {
        int ans = 0;
        int base = 5;

        while (n > 0) {
            int last = n & 1;
            n >>= 1;
            ans += last * base;
            base *= 5;
        }
        return ans;
    }
}