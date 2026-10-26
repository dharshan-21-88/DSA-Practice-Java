//https://leetcode.com/problems/two-sum/
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] ans = Optimal(nums, target);
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

    static int[] Optimal(int[] nums, int target){
        HashMap <Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            if(map.containsKey(need)){
                return new int[] {map.get(need), i};
            }

            else{
                map.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
