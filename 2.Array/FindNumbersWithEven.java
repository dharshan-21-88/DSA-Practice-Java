//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

import java.util.Scanner;

public class FindNumbersWithEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers( nums));
        in.close();
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(hasEvenNumberOfDigits(nums[i])){
                count++;
            }
        }
        return count;
    }

    static int numberOfDigits(int num){
        // int count=0;
        // while(num>0){
        //     num/=10;
        //     count++;
        // }
        // return count;
        return (int)(Math.log10(num))+1;   //Shortcut for getting number of digits
    }

    static boolean hasEvenNumberOfDigits(int num){
        int digits = numberOfDigits(num);
        return digits%2 == 0;
    }
}