//https://leetcode.com/problems/single-number/
package bitwise;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2, 5, 4, 3, 1, 6, 1, 3, 4, 5, 2}; //Every no. appears twice except one no.
        System.out.println(unique(nums));
    }

    static int unique(int[] nums) {
        int ans = 0; // 0 works because any no. XOR 0 is the no. itself

        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }
}
