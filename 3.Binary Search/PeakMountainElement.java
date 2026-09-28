//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakMountainElement {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end-start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }
        }
        return start;
    }
}

