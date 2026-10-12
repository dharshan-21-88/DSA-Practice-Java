//https://leetcode.com/problems/arranging-coins/
public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(1804289383));
    }

    static int arrangeCoins(int n) {
        int start = 1;
        int end = n;

        while(start <= end){
            int mid = start + (end - start)/2;

            // Coins required for 'mid' rows
            long coins = (long) (mid*(mid + 1L))/2;  // Using long because of int overflow        

            if(coins == n){
                return mid;
            }

            else if(coins < n){
                start = mid + 1;
            }

            else{
                end = mid - 1;
            }
        }
        return end;
    }
}
