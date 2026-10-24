//https://leetcode.com/problems/sort-array-by-parity/description/
import java.util.Arrays;

public class SortByParity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity1(nums)));
    }

    static int[] sortArrayByParity(int[] nums) {   // Auxillary space
        int[] ans = new int[nums.length];
        int start = 0;
        int end = ans.length-1;
        int i = 0;
        while(start <= end){
            if(nums[i] % 2==0){
                ans[start] = nums[i];
                start++;
            }
            else{
                ans[end] = nums[i];
                end--;
            }
            i++;
        }
        return ans;
    }

    static int[] sortArrayByParity1(int[] nums) {  //In place
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] %2 == 0){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
        return nums;
    }
}
