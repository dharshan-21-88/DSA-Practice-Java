//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/description/
public class MatrixRotation {
    public static void main(String[] args) {
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] target = {{1,1,1},{0,1,0},{0,0,0}};
        System.out.println(findRotation(mat, target));
    }

    static boolean findRotation(int[][] mat, int[][] target) {
        int rot = 0;

        while(rot < 4){
            boolean match = true;
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    if(mat[i][j] != target [i][j]){
                        match = false;
                    }
                }
            }

            if(match){
                return true;
            }

            Rotation(mat);
            rot++;
        }
        return false;
    }

    static void Rotation(int[][] mat){           //To Rotate 90' Transpose then Reverse each row
        for (int i = 0; i < mat.length; i++) {   //Transpose
            for (int j = 0; j < i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < mat.length; i++) {   //Reverse Each Row
            int left = 0;
            int right = mat[i].length-1;
            
            while(left <= right){
                int temp = mat[i][right];
                mat[i][right] = mat[i][left];
                mat[i][left] = temp;
                left++;
                right--; 
            }
        }
    }
}

