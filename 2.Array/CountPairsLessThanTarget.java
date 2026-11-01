//https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountPairsLessThanTarget {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(-1,1,2,3,1)); 
        System.out.println(countPairs(nums, 2));
    }

    static int countPairs(ArrayList<Integer> nums, int target) {
        int left = 0;
        int right = nums.size() - 1;
        int count = 0;

        Collections.sort(nums);

        while(left < right){
            if(nums.get(left) + nums.get(right) < target){
                count += right - left;
                left++;
            }

            else{
                right--;
            }
        } 
        return count;
    }
}
