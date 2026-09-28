import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        ch = Character.toLowerCase(ch);

        if(ch >='a' && ch <='z'){
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println("Vowel");
            }
            else{
                System.out.println("Consonant");
            }
        }
        else{
            System.out.println("Enter a valid letter");
        }
        in.close();
    }
}
