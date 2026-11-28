package bitwise;

public class NoOfDigits {
    public static void main(String[] args) {
        int n = 256;
        int b = 10; //base 2 (binary)

        int ans = (int)(Math.log(n) / Math.log(b)); // logbase(n) == log(n)/log(base)

        System.out.println(ans + 1);
    }
}
