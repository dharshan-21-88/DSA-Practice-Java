//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
import java.util.Arrays;

public class UniqueSumUptoZero {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));
    }
    static int[] sumZero(int n) {
        int[] arr = new int[n];
        int negdigit = n/2;
        int posdigit = 1;

        for(int i=0;i<n-1;i++){
            if(i<=n/2 && negdigit>0){
                arr[i]= 0-negdigit;
                negdigit--; 
            }
            else{
                arr[i] = posdigit;
                posdigit++;
            }
        }
        if(n%2 == 0){
            arr[n-1]=posdigit;
        }
        else{
            arr[n-1]=0;
        }
        return arr;
    }
}
