//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
public class MaximumNoWords {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
    static int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < sentences.length; i++) {
            int NoOfWords = 1;
            for (int j = 0; j < sentences[i].length(); j++) {
                if(sentences[i].charAt(j) == ' '){
                    NoOfWords++;
                }
            }
            if(NoOfWords>max){
                max=NoOfWords;
            }
        }
        return max;
    }
}
