//Check if give no. is a Armstrong no.(3 digits)
// import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter number: ");
        // int num = in.nextInt();
        for (int i = 100; i < 1000; i++) {
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isArmstrong(int num){
        int original = num;
        int sum = 0 ;
        while( num != 0) {
            int rem = num % 10;
            sum += rem*rem*rem ;
            num /= 10;
        }
        return original==sum;
    }
}