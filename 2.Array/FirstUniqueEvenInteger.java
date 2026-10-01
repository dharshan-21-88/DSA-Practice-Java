//https://leetcode.com/problems/first-unique-even-element/description/
public class FirstUniqueEvenInteger {
    public static void main(String[] args) {
        int[] nums = {3,4,2,5,4,6};
        System.out.println(firstUniqueEven(nums));
    }

    static int firstUniqueEven(int[] nums) {

        for(int i = 0;i<nums.length;i++){
           if(isUnique(nums,nums[i]) && nums[i]%2==0){
                return i;
           }
        }
        return -1;
    }

    static boolean isUnique(int[] nums, int x){
        int count =0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == x){
                count++;
            }
        }
        return count == 1;
    }
}
