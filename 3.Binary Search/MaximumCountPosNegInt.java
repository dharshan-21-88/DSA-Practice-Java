//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
public class MaximumCountPosNegInt {
    public static void main(String[] args){
        int[] nums = {-3,-2,-1,0,1,2,3,4,5,6,7,8};
        System.out.println(maximumCount(nums));
    }

    static int maximumCount(int[] nums) {
        return Math.max(neg(nums),pos(nums));
    }

    static int neg(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start +(end - start)/2;

            if(nums[mid] < 0){
                start = mid +1;
            }
            else if(nums[mid] >= 0){
                end = mid -1;
            }
        }
        return start;
    }

    static int pos(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start +(end - start)/2;

            if(nums[mid] > 0){
                end = mid -1;
            }
            else if(nums[mid] <= 0){
                start = mid +1;
            }
        }
        return nums.length-start;
    }
}
