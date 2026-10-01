//https://leetcode.com/problems/first-unique-even-element/description/
public class FirstUniqueEvenInteger {
    public static void main(String[] args) {
        int[] nums = {6, 4, 2, 4};
        System.out.println(firstUniqueEven(nums));
    }

    static int firstUniqueEven(int[] nums) {
        int[] freq = new int[101];
        for(int i = 0;i<nums.length;i++){
            freq[nums[i]]++;
        }

        for (int k = 0; k < nums.length; k++) {
            if(freq[nums[k]] ==1 && nums[k] % 2 == 0 ){
                return nums[k];
            }
        }
        return -1;
    }
}
