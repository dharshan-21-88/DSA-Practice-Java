// A leap year occurs every 4 years, except for years divisible by 100 unless they are also divisible by 400.
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        System.out.println(isLeap(year));
        in.close();
    }
    static boolean isLeap(int year){
        return year%400==0 || (year%4==0 && year%100 != 0);
    }
}
