// https://leetcode.com/problems/contains-duplicate/
import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicateMap(nums));
        System.out.println(containsDuplicateSet(nums));
    }
    static boolean containsDuplicateMap(int[] nums) {      //HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                return true;
            }
        }
        return false;
    }

    static boolean containsDuplicateSet(int[] nums) {      //HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        if (set.size() != nums.length) {
            return true;
        }
        return false;
    }
}
