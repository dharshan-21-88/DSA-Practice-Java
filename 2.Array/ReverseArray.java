import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int[] swapped = reverse(arr);
        System.out.println(Arrays.toString(swapped));
        in.close();
    }

    static int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    return arr;
    }
}
