//https://leetcode.com/problems/sqrtx/
public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(BinarySearch(8));
    }
    static int sqrt(int x){                  //Brute Force
        for (int i = 0; i <= x; i++) {
            if(i*i == x){
                return i;
            }
            if(i*i > x){
                return i-1;
            }
        }
        return -1;
    }

    static int BinarySearch(int x){          //Binary Search
        int start = 0;
        int end = x;

        while(start <= end){
            int mid = start + (end - start)/2;
            long sqr = (long) mid * mid;     //Prevents Integer Overflow

            if(sqr < x){
                start = mid + 1;
            }
            else if(sqr > x){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
