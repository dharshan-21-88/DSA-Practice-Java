public class Basics {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12};
        int target = 5;
        System.out.println(OrderAgnosticBS(arr,target));
    }

    static int Ascending(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
        //  int mid = (start+end)/2;  the (start+end) may exceed the range of int in java
            int mid = start + (end-start)/2;

            if(arr[mid] < target){
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int Descending(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
        //  int mid = (start+end)/2;  the (start+end) may exceed the range of int in java
            int mid = start + (end-start)/2;

            if(arr[mid] > target){
                start = mid + 1;
            }
            else if(arr[mid] < target){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int OrderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(arr[mid] < target){
                start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else{
                if(arr[mid] > target){
                start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}