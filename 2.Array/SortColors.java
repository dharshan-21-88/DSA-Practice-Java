//https://leetcode.com/problems/sort-colors/

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sortColors(int[] nums) {
        int zeroes = 0;
        int ones = 0;
        int twos = 0;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                zeroes++;
            }
            else if(nums[i] == 1){
                ones++;
            }
            else{
                twos++;
            }
        }

        for (int i = 0; i < zeroes; i++) {
            nums[index] = 0;
            index++;
        }
        for (int i = 0; i < ones; i++) {
            nums[index] = 1;
            index++;
        }
        for (int i = 0; i < twos; i++) {
            nums[index] = 2;
            index++;
        }
    }
}
