//https://www.geeksforgeeks.org/dsa/find-rotation-count-rotated-sorted-array/
public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {7, 9, 11, 12, 15};
        System.out.println(findk(arr));
    }

    static int findk(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end-start)/2;
            
            if(arr[mid] > arr[end]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
}
