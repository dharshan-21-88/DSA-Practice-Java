//https://leetcode.com/problems/two-sum/
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] ans = Brute(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Brute(int[] nums, int target) {          //Optimal uses HashMap learn it.
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    // static int[] Optimal(int[] nums, int target){
    //     int[] rem = new int[nums.length-1];
    //     int num2 = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         num2 = target-nums[i];
    //         rem[i] = nums[i];
    //         if(nums[i]+rem[i]==target){
    //             return {}
    //         }
    //     }
    //     return new int[] {-1,-1};
    // }
}
