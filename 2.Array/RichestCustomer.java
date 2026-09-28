//https://leetcode.com/problems/richest-customer-wealth/
import java.util.Scanner;

public class RichestCustomer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] accounts = new int[5][0];
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts.length; j++) {
                accounts[i][j] = in.nextInt();
            }
        }
        int wealth = maximumWealth(accounts);
        System.out.println(wealth);
        in.close();
    }
    public static int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            maximumWealth = Math.max(maximumWealth, sum);
        }
        return maximumWealth;
    }
}
