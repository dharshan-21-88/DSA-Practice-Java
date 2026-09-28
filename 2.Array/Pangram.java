//https://leetcode.com/problems/check-if-the-sentence-is-pangram/

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        System.out.println(checkIfPangram1(sentence));
        in.close();
    }
    static boolean checkIfPangram1(String sentence) {     // Uses many inbuilt functions
        boolean isPangram = true;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 26; i++) {
            if(sentence.indexOf((alphabet.charAt(i)))==-1){
                isPangram = false;
            }
        }
        return isPangram;
    }
    public boolean checkIfPangram2(String sentence) {     // More simpler
        for(char start='a'; start<='z'; start++){
            if(sentence.indexOf(start) == -1){
                return false;
            }
        }
        return true;
    }
}
