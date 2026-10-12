//https://leetcode.com/problems/sum-of-squares-of-special-elements/
public class SumOfSquares {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println(sumOfSquares(nums));
    }

    static int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sos = 0;
        for (int i = 0; i < n; i++) {
            if (n % (i + 1) == 0) {
                sos += (nums[i] * nums[i]);
            }
        }
        return sos;
    }
}
