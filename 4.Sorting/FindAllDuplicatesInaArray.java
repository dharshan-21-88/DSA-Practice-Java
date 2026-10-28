//https://leetcode.com/problems/find-all-duplicates-in-an-array/
import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInaArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(findDuplicates(nums));
    }

    static List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        while (i < nums.length){
            int correct = nums[i] -1;

            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }

            else{
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1){
                list.add(nums[j]);
            }
        }
        return list;
    }
}
