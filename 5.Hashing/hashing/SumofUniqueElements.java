//https://leetcode.com/problems/sum-of-unique-elements/
package hashing;

import java.util.HashMap;

public class SumofUniqueElements {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2};
        System.out.println(sumOfUnique(nums));
    }

    static int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int key : nums) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (int num : nums) {
            if (map.get(num) == 1) {
                sum += num;
            }
        }

        return sum;
    }
}
