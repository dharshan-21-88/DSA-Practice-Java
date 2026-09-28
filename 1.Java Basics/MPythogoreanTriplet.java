import java.util.Scanner;

public class MPythogoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(triplet(a,b,c));
        in.close();
    }
    static boolean triplet(int a,int b,int c){
        int hyp = Math.max(c,Math.max(a, b));
        return hyp*hyp == a*a + b*b + c*c - hyp*hyp;
    }
}
