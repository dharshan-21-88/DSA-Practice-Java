//https://leetcode.com/problems/remove-element/
public class RemoveElement {
    public static void main(String[] args) {
        int [] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }

    static int removeElement(int[] nums, int val) {
        int index = 0;
        int count = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] != val){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
                count++;
            }
        }
        return count;
    }
}
