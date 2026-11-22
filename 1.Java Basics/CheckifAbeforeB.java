//https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/description/
public class CheckifAbeforeB {
    public static void main(String[] args) {
        String s = "aaaaa";
        System.out.println(checkString(s));
    }

    static boolean checkString(String s) {
        boolean seenB = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') {
                seenB = true;
            }

            if (s.charAt(i) == 'a' && seenB) {
                return false;
            }
        }
        return true;
    }
}