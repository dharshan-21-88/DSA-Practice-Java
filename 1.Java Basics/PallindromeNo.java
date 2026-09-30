//https://leetcode.com/problems/palindrome-number/
import java.util.Scanner;

public class PallindromeNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(isPalindrome(x));
        in.close();
    }

    static boolean isPalindrome(int x) {
        int original = x;
        int rev = 0;

        if(original < 0){
            return false;
        }

        while(x > 0){
            int digit = x % 10;
            x /=10;
            rev = rev * 10 + digit;
        }
        
        return (rev == original);
    }
}
