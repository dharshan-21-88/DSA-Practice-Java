//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbersInanArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        System.out.println(findDisappearedNumbers(nums));
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        while(i < nums.length){
            int correct = nums[i] -1;

            if(correct < nums.length && nums[i] != nums[correct]){ 
            // Since you used the condition != ,the duplicate values are handled
            // because if duplicate x is already at the correct index then the condition becomes
            // == ,and is pushed to the else block
                int temp = nums[i];                                
                nums[i] = nums[correct];
                nums[correct] = temp;
            }

            else{
                i++;
            }
        }

        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1){
                list.add(j+1);
            }
            else{
                continue;
            }
        }
        return list;
    }
}
