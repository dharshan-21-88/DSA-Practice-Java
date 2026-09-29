//https://leetcode.com/problems/lucky-numbers-in-a-matrix/
import java.util.ArrayList;
import java.util.List;

public class LuckyNumberInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> ans = luckyNumbers(matrix);
        System.out.println(ans);
    }

    static List<Integer> luckyNumbers(int[][] matrix) {

        int maxColumn = 0;

        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        for (int i = 0; i < matrix.length; i++) {

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            // Find minimum in current row
            for (int j = 0; j < matrix[i].length; j++) {
                if(min > matrix[i][j]){
                    min = matrix[i][j];
                    maxColumn = j;         //Remember the column where we found min
                }       
            }

            // Find maximum in that column
            for (int k = 0; k < matrix.length; k++) {
                if(max < matrix[k][maxColumn]){
                    max = matrix[k][maxColumn];
                }
            }

            if(min == max){
                ans.add(min);
            }
        }
        return ans;
    }
}
