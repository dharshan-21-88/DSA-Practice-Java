//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 2;
        System.out.println(search(arr, target));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if(pivot == -1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        
        else if(nums[pivot] == target){
            return pivot;
        }
        else{
            int firstTry = binarySearch(nums,target,0,pivot-1);
            if(firstTry != -1){
                return firstTry;
            }
            return binarySearch(nums,target,pivot+1,nums.length-1);
        }
    }

    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if(nums[mid] <= nums[start]){
                end = mid-1;
            }
            if(nums[mid] > nums[start]){
                start = mid+1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] nums, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < nums[mid]){
                end = mid-1;
            }
            else if(target > nums[mid]){
                start = mid +1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
