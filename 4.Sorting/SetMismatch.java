//https://leetcode.com/problems/set-mismatch/description/
import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {2,2};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    static int[] findErrorNums(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (correct < nums.length && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return new int[] { nums[j], j + 1 };
            }
        }
        return new int[] { -1, -1 };
    }
}