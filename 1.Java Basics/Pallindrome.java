import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string:");
        String pal = in.next();
        String lap = "";

        pal = pal.toLowerCase();

        for (int i = pal.length()-1; i >= 0 ; i--) {
            char ch = pal.trim().charAt(i);
            lap = lap + ch;
        }
        if (pal.equals(lap)){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not a pallindrome");
        }
        in.close();
    }
}
