//https://leetcode.com/problems/add-to-array-form-of-integer/
import java.util.ArrayList;

public class AddToArrayFormOfIntegers {
    public static void main(String[] args) {
        int[] num = {2};
        int k = 99;
        ArrayList<Integer> ans = addToArrayForm(num,k);
        System.out.println(ans);
    }
    static ArrayList<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int carry=0;
        int digit = 0;
        int total = 0;
        int i = num.length-1;
        while(i>=0){                // While there are still no.s in num
            digit = k % 10;
            k/=10;

            total = num[i] + digit + carry;
                
            ans.add(0,total%10);

            carry = total/10;
            i--;
        }
        while(i < 0 && k > 0){        // When k > num
            digit = k % 10;
            k/=10;

            total = digit + carry;
                
            ans.add(0,total%10);
            carry = total/10;
        }

        while(carry > 0 && i < 0 && k == 0){
            ans.add(0,carry%10);
            carry /=10;
        }
        
        return ans;
    }
}
