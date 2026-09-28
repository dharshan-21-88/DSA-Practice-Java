//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
import java.util.Arrays;
import java.util.Scanner;

public class NosSmallerThanCurrent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int[] result = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
        in.close();
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int freq = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j]<nums[i]){
                    freq++; 
                }
            }
            result [i] = freq;
        }
        return result;
    }
}
