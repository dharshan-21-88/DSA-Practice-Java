//https://leetcode.com/problems/add-digits/
public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    static int addDigits(int num) {
        int ans = sum(num);
        while (ans > 9) {
            ans = sum(ans);
        }
        return ans;
    }

    static int sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
