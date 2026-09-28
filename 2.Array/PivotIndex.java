// https://leetcode.com/problems/find-pivot-index/
public class PivotIndex {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
    static int pivotIndex(int[] nums) {
        int index = 0;
        int sum = 0;
        int lsum = 0;
        for (int element : nums) {
            sum +=element;
        }
        for (index = 0; index < nums.length; index++) {
            int rsum = 0;

            rsum = sum - lsum - nums[index];
            lsum = sum - rsum - nums[index];

            if(lsum == rsum){
                return index;
            }
            lsum+=nums[index];
        }
        return -1;
    }
}
