//https://leetcode.com/problems/check-if-n-and-its-double-exist/
public class NandItsDoubleExist{
    public static void main(String[] args) {
        int[] arr = {1,0};
        System.out.println(checkIfExist(arr));
    }

    static boolean checkIfExist(int[] arr) {
        int zerocount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                zerocount++;
            }
        }

        if(zerocount > 1){
            return true;
        }

        else{
            bubbleSort(arr);

            for (int i = 0; i < arr.length; i++) {
                int target = 2*arr[i];
                if(binarySearch(arr, target , i)){
                    return true;
                }
            }
        }
        return false;
    }

    static void bubbleSort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {         
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    static boolean binarySearch(int[] arr , int target ,int i){
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid != i && arr[mid] == target){
                return true;
            }
            else if(arr[mid] > target){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return false;
    }
}