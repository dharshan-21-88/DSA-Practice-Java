public class CountNegIntInSortedMatrix {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},
                        {3,2,1,-1},
                        {1,1,-1,-2},
                        {-1,-1,-2,-3}};

        // int[][] grid = {{3,2},{1,0}};

        System.out.println(countNegatives(grid));
    }

    static int countNegatives(int[][] grid) {
         int count = 0;

         for (int i = 0; i < grid.length; i++) {
            int index = binarySearch(grid, i);

            count += grid[i].length - index;
         }
         return count;
    }

    static int binarySearch(int [][]grid, int rindex){
        int start = 0;
        int end = grid[rindex].length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(grid[rindex][mid] < 0){
                end = mid - 1;
            }

            else if(grid[rindex][mid] >= 0){
                start = mid + 1;
            }
        }
        return start;
    }
}