//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class FirstLastinSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target) {
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        return new int[] {start,end};
    }

    static int first(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int ans = 0;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid] < target){
                start = mid + 1;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
            else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    static int last(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int ans = 0;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid] < target){
                start = mid + 1;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
            else {
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }

    static int search(int[] nums, int target, boolean isStart){
        int start = 0;
        int end = nums.length-1;
        int ans =-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid] < target){
                start = mid + 1;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
            else {
                if(isStart){
                    ans = mid;
                    end = mid - 1;
                }
                else{
                    ans = mid;
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
