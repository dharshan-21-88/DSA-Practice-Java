// Define two methods to print the maximum and the minimum number respectively
// among three numbers entered by the user.
import java.util.Scanner;
public class MMaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(max(a,b,c));
        System.out.println(min(a,b,c));
        in.close();
    }
    static int max(int a,int b,int c){
        int large=a;
        if(b>large){
            large=b;
        }
        if(c>large){
            large=c;
        }
        return large;
    }
    static int min(int a,int b,int c){
        int small=0;
        if(a<b){
            small=a;
        }
        else{
            small=b;
        }
        if(c<small){
            small=c;
        }
        return small;
    }
}