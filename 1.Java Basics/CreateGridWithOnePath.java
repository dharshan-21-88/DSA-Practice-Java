//https://leetcode.com/problems/create-grid-with-exactly-one-path/description/
import java.util.Arrays;

public class CreateGridWithOnePath {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createGrid(4, 2)));
    }

    static String[] createGrid(int m, int n) {
        String[] grid = new String[m];
        
        for(int i =0;i<m;i++){
            grid[i] = "";
            for(int j=0;j<n;j++){
                if(i == 0){
                    grid[i] += ".";
                }

                else{
                    if(j != n-1){
                        grid[i] += "#";
                    }

                    else{
                        grid[i] += ".";
                    }
                }
            }
        }
        return grid;
    }
}
