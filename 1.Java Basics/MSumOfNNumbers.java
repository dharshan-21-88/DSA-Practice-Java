import java.util.Scanner;

public class MSumOfNNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        sumofn(n);
        in.close();
    }
    static void sumofn(int n){
        int sum = 0;
        for (int i = 1; i <=n; i++) {
            sum+=i;
        }
        System.out.println(sum);
    } 
}
