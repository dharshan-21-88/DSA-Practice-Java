//https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArrayBS {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 8, 9, 10, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(arr[end] < target){
            int newStart = end + 1;
            // end = previous end + size of the box*2
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        return BinarySearch(arr, target, start, end);
    }

    static int BinarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] < target){
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
