// import java.util.Arrays;
// import java.util.Scanner;

// public class First {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int[] arr = new int[5];

//         for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt(); 
//         }
//         for (int element : arr) {
//            System.out.print(element + " ");
//         }
//         System.out.println(Arrays.toString(arr));
//         in.close();
//     }
// }
import java.util.Arrays;

public class ArrayBasicsSyntax {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));


    // List<Datatype> name = new ArrayList<>();            // syntax for arraylist


    }
    static void change(int[] arr){
        arr[0]=10;
    }
}