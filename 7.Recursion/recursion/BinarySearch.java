package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 6;
        int s = 0;
        int e = arr.length - 1;
        System.out.println(search(arr, target, s, e));
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }
        else if (arr[m] < target) {
            //s = m + 1;
            return search(arr, target, m + 1, e);
        }

        //e = m - 1;
        return search(arr, target, s, m - 1);
    }
}
