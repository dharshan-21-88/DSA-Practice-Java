//https://leetcode.com/problems/flipping-an-image/
import java.util.Arrays;

public class ImageFlipping {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},
                         {1,0,1},
                         {0,0,0}};
        int[][] fandi = flipAndInvertImage(image);
        for (int i = 0; i < fandi.length; i++) {
            System.out.println(Arrays.toString(fandi[i]));
        }                
    }
    static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
                int start = 0;
                int end = image[i].length-1;
                while(start<end){
                    int temp = image[i][start];
                    image[i][start]=1-image[i][end];
                    image[i][end]=1-temp;
                    start++;
                    end--;
                }
                if(start==end){
                    image[i][start] = 1-image[i][start];
                }
            }
        return image;
        }
    }

