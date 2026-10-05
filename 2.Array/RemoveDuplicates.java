//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    static int removeDuplicates(int[] nums) {
        int index = 1;

        for(int i =0; i<nums.length;i++){
            
            if(nums[i] > nums[index - 1]){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
