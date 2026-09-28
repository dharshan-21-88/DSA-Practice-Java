//https://leetcode.com/problems/majority-element/description/
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(BoyerMoore(nums));
    }

    static int majorityElement(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int count = 1;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }

    static int BoyerMoore(int[] nums) {
        int count = 0;
        int candidate = 0 ;
        for (int i = 0; i < nums.length; i++) {
            if(count==0){
                candidate = nums[i];
            }
            if(candidate == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}

