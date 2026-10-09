//https://leetcode.com/problems/find-target-indices-after-sorting-array
import java.util.ArrayList;

public class FindTargetIndices {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        ArrayList<Integer> result = targetIndices(nums, 2);
        System.out.println(result);
    }

     static ArrayList<Integer> targetIndices(int[] nums, int target) {
        int lessCount = 0;
        int targetCount = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < target){
                lessCount++;
            }
            else if(nums[i] == target){
                targetCount++;
            }
            else{
                continue;
            }
        }

        for (int i = lessCount; i < lessCount + targetCount; i++) {
            ans.add(i);
        }

        return ans;
    }
}
