//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
public class CapacityToShipWithinDDays {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights, days));
    }

    static int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];

            if(weights[i] > max){
                max = weights[i];
            }
        }

        int start = max;
        int end = sum;

        while(start <= end){
            int mid = start + (end -start)/2;

            if(canShip(weights, mid, days)){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    static boolean canShip(int[] weights, int capacity, int days) {
        int load = 0;
        int count = 1;
        for (int i = 0; i < weights.length; i++) {
            if(weights[i] + load <= capacity){
                load += weights[i];
            }
            else{
                count++;
                load = weights[i];
            }
        }
        return count<=days;
    }
}
