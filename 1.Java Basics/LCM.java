import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = 1; i <= a*b; i++) {
           if(i%a==0 && i%b==0){
            System.out.println(i);
            break;
           } 
        }
        in.close();
    }
}
