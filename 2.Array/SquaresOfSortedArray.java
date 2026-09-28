// https://leetcode.com/problems/squares-of-a-sorted-array/

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        int[] ans = sortedSquares(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int index = nums.length-1;
        int[] ans = new int[nums.length];
        while (left<=right) {
            if(Math.abs(nums[left])<Math.abs(nums[right])){
                ans[index]=nums[right]*nums[right];
                right--;
            }
            else{
                ans[index]=nums[left]*nums[left];
                left++;
            }
        index--;
        }
    return ans;
    }
}
