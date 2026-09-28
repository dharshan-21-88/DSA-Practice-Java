// Sum of N Numbers, Average of N Numbers, Average Marks

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = sum(in, n);
        float avg = (float)result/n;
        System.out.println(result);
        System.out.println(avg);
    }
    static int sum(Scanner in,int n){
        int sum = 0;
        int num;
        for (int i = 0; i < n; i++) {
            num = in.nextInt();
            sum+=num;
        }
        return sum;
    }
}