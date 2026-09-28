//https://leetcode.com/problems/create-target-array-in-the-given-order/
import java.util.Arrays;
import java.util.Scanner;

public class TargetArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int[] index = new int[n];
        for (int i = 0; i < nums.length; i++) {
            index[i] = in.nextInt();
        }
        int[] target = createTargetArray(nums, index);
        System.out.println(Arrays.toString(target));
        in.close();
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j > index[i]; j--) {
                target[i]=target[i-1];
                target[index[i]] = nums[i];
            } 
        }
        return target;
    }
}
