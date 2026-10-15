//https://leetcode.com/problems/search-a-2d-matrix/
public class SearchA2Dmatrix {
    public static void main(String[] args) {
        // int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        // int target = 1;

        int[][] matrix = {{1}};
        int target = 0;
        System.out.println(searchMatrix(matrix, target));
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int colend = matrix[0].length - 1;
        int rows = matrix.length;
        int Srow = 0;
        int Erow = rows - 1;

        while(Srow < Erow){
            int mid = Srow + (Erow - Srow)/2;

            if(target > matrix[mid][colend]){
                Srow = mid + 1;
            }

            else{
                Erow = mid;
            }
        }

        return simpleBS(matrix, target, Srow, 0, colend);
    }

    static boolean simpleBS(int[][] matrix , int target ,int row ,int Scol , int Ecol ){
        while (Scol <= Ecol){
            int mid = Scol + (Ecol - Scol)/2;

            if(matrix[row][mid] == target){
                return true;
            }

            else if(matrix[row][mid] < target){
                Scol = mid + 1;
            }

            else{
                Ecol = mid -1;
            }
        }
        return false;
    }
}
