//https://leetcode.com/problems/missing-number/
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums) {
        int i = 0;

        while(i < nums.length){
            int correct = nums[i];

            if(correct == nums.length){
                i++;
            }

            else if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }

            else{
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] == j){
                continue;
            }

            else{
                return j;
            }
        }
        return nums.length;
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}