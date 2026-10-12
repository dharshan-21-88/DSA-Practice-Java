import java.util.Arrays;

public class BinarySearchinSortedMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,4},            // Col wise & row wise sorted
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}
                        };

        System.out.println(Arrays.toString(searchSorted(matrix, 9)));
    }

    // Simple Binary Search to search through rows when the row index and column indices are provided
    static int[] binarySearch(int[][] matrix, int target, int row, int Cstart, int Cend){
        while(Cstart <= Cend){                       
            int mid = Cstart + (Cend - Cstart)/2;

            if(matrix[row][mid] == target){
                return new int[] {row,mid};
            }

            else if(matrix[row][mid] < target){
                Cstart = mid + 1;
            }
            
            else{
                Cend = mid - 1;
            }
        }
        return new int[] {-1,-1};
    }

    static int[] searchSorted(int[][] matrix, int target){ // When the matrix is sorted
        int rows = matrix.length;
        int cols = matrix[0].length-1; // Be cautious ,Matrix maybe empty
        
        if (cols == 0){
            return new int[] {-1,-1};
        }

        if(rows == 1){
            return binarySearch(matrix, target, 0, 0, cols-1);
        }

        int rStart = 0;             // This is eliminating the rows, you can also do column wise
        int rEnd = rows -1;
        int cMid = cols/2;          // Finding the middle column

        while(rStart < (rEnd-1)){   // After the loop ends we'll have 2 rows 
            int mid = rStart + (rEnd - rStart)/2;

            if(matrix[mid][cMid] == target){
                return new int[] {mid,cMid};
            }

            else if(matrix[mid][cMid] < target){
                rStart = mid;
            }

            else if(matrix[mid][cMid] > target){
                rEnd = mid;
            }
        }

        // Now we have two rows
        // Check whether the target is in the col of 2 rows
        if(matrix[rStart][cMid] == target){
            return new int[] {rStart,cMid};
        }

        if(matrix[rEnd][cMid] == target){  // End here is start + 1
            return new int[] {rEnd,cMid};
        }

        // Search in 1st half
        if(target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix, target, rStart, 0, cMid-1);
        }

        // Search in 2nd half
        if(target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols-1]){
            return binarySearch(matrix, target, rStart, cMid + 1, cols - 1);
        }

        // Search in 3rd half
        if(target <= matrix[rEnd][cMid - 1]){
            return binarySearch(matrix, target, rEnd, 0, cMid-1);
        }

        // Search in 4th half
        if(target >= matrix[rEnd][cMid + 1]){
            return binarySearch(matrix, target, rEnd, cMid + 1, cols - 1);
        }

        return new int[] {-1,-1};
    }
}
