//https://leetcode.com/problems/valid-palindrome/
public class ValidPallindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s){
        s = s.toLowerCase();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while (!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while (!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if (s.charAt(left)==s.charAt(right)){
                left++; 
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
