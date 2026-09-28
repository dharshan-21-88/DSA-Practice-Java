import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans = transpose(matrix);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }

    static int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length]; 
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                    ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}
