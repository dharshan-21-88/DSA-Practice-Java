//https://leetcode.com/problems/restore-finishing-order/
import java.util.Arrays;

public class RestoreFinishingOrder {
    public static void main(String[] args) {
        int[] order = {3,1,2,5,4};
        int[] friends = {1,3,4};
        System.out.println(Arrays.toString(recoverOrder(order, friends)));
    }

    static int[] recoverOrder(int[] order, int[] friends) {
        int[] resFO = new int[friends.length];
        int k = 0;

        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < friends.length; j++) {
                if (order[i] == friends[j]) {
                    resFO[k] = order[i];
                    k++;
                }
            }
        }
        return resFO;
    }
}
