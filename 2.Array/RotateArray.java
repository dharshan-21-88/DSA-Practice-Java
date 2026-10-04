//https://leetcode.com/problems/rotate-array/
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int[] ans = rotate(nums, k);
        System.out.println(Arrays.toString(ans));
        // rotate1(nums, k);
        // System.out.println(Arrays.toString(nums));
    }

    static int[] rotate(int[] nums, int k) {         // Space - O(n)
        int index = nums.length-k;
        int[] ans = new int[nums.length];
        int l = 0;

        for (int i = 0; i < nums.length; i++) {
            // if(index < nums.length-1){
            //     int temp = nums[i];
            //     nums[i] = nums[index];
            //     nums[index] = temp;
            //     index++;
            // }

            if(index <= nums.length-1){
                ans[i] = nums[index];
                index++;
            }
            else{
                if(l < nums.length-k){
                    ans[i] = nums[l];
                    l++;
                }
            }
        }
        return ans;
    }

    // static void rotate1(int[] nums, int k){
    //     int index = nums.length-k;

    // }
}
