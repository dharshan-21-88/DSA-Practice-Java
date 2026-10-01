//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] numbers = {-1,0};
        int target = -1;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
    
    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;

        while(start < end){
            int sum = numbers[start] + numbers[end];

            if(sum > target){
                end--;
            }
            else if(sum < target){
                start++;
            }
            else{
                return new int[]{start+1,end+1};
            }
        }
        return new int[]{-1,-1};
    }
}
