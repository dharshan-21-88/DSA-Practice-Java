//https://leetcode.com/problems/shuffle-the-array/
import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[2*n];
        for (int i = 0; i < nums.length; i++) {
                nums[i] = in.nextInt();
        }
        int[] res = shuffle(nums,n);
        System.out.println(Arrays.toString(res));
        in.close();
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        for (int i = 0; i < n; i++) {
            res[i*2] = nums [i];
            res[i*2+1] = nums [i+n];
        }
        return res;
    }
}

