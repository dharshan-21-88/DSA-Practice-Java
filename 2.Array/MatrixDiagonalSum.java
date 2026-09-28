//https://leetcode.com/problems/matrix-diagonal-sum/
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        System.out.println(diagonalSum2(mat));
    }

    static int diagonalSum(int[][] mat) {
        int sum = 0;
        int left = 0;
        int right = mat.length-1;
        for (int i = 0; i < mat.length; i++) {
            if(i==left){
                sum+=mat[i][left];
            }
            if(left!=right && left < mat.length && right >=0){
                sum += mat[left][right];
                left++;
                right--;
            }
            else{
                left++;
                right--;
            }
        }
    return sum;
    }

    static int diagonalSum2(int[][] mat) {                        //More Simpler
        int pd = 0;
        int sd = 0;                          
        for (int i = 0; i < mat.length; i++) {
            pd += mat[i][i];
            if(i != mat.length-1-i){
                sd += mat[i][mat.length-1-i];
            }
        }
    return pd+sd;
    }
}
