// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KidWithGreatNoCandies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] candies = new int[n];
        for (int i = 0; i < n; i++) {
            candies[i] = in.nextInt();
        }
        int extraCandies = in.nextInt();
        List<Boolean> result = kidsWithCandies(candies,extraCandies);
        System.out.println(result);
        in.close();
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int largest = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if(largest<candies[i]){
                largest = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]+extraCandies>=largest){
                result.add(true);
            }
            else{
                result.add(false);    
            }
        }
        return result;
    }
}
