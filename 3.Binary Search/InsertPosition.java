//https://leetcode.com/problems/search-insert-position/description/?envType=problem-list-v2&envId=binary-search
public class InsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }

    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid] < target){
                start = mid+1;
            }
            else if(nums[mid] > target){
                end = mid-1;
            }
            else if(nums[mid] == target){
                return mid;
            }
        }
        return start;
    }
}
