//https://leetcode.com/problems/find-words-containing-character/
import java.util.ArrayList;
import java.util.List;

public class FindWordContainingChar {
    public static void main(String[] args) {
        String[] words = {"leet","code"};
        System.out.println(findWordsContaining(words, 'e'));
    }

    static List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {

                if (words[i].charAt(j) == x) {
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}

