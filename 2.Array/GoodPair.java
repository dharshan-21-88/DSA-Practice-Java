// https://leetcode.com/problems/number-of-good-pairs/
import java.util.Scanner;

public class GoodPair {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println(numIdenticalPairs(nums));
        in.close();
    }
    public static int numIdenticalPairs(int[] nums) {
        int result=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    result++;
                }
            }
        }
        return result;
    }
}
