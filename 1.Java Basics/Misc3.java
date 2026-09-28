// Write a program to print the sum of negative numbers, sum of positive even numbers 
// and the sum of positive odd numbers from a list of numbers (N) 
// entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;

public class Misc3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sumn = 0;
        int sumpo = 0;
        int sumpe = 0;
        while(n!=0){
            if(n<0){
                sumn +=n;
            }
            else if(n%2==0){
                sumpe+=n;
            }
            else{
                sumpo+=n;
            }
            n = in.nextInt();
        }
        System.out.println(sumn);
        System.out.println(sumpo);
        System.out.println(sumpe);
        in.close();
    }
}
