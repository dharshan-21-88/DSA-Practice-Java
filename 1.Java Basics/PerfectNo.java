import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;

        for (int i = 1; i < n ; i++) {
            if(n%i==0){
                sum +=i;
            }
        }
        if(n==sum){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
        in.close();
    }
}
