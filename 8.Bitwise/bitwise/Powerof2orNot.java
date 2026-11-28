package bitwise;

public class Powerof2orNot {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(ispower2(n));
    }

    static boolean ispower2(int n) {
        if (n == 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}