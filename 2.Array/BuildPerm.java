//https://leetcode.com/problems/build-array-from-permutation/
import java.util.Scanner;

public class BuildPerm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[6];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int[] ans = buildArray(nums);
        for(int a : ans){
            System.out.println(a);
        }
        in.close();
    }
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
