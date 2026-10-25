//https://leetcode.com/problems/truncate-sentence/description/
public class TruncateSentence {
    public static void main(String[] args) {
        String s = "Hello world how are you";
        int k = 2;
        System.out.println(truncateSentence(s, k));
    }

    static String truncateSentence(String s, int k) {
        int count = 0; 
        String trunc = "";
        for(int i=0;i<s.length();i++){
            if(count < k){
                if(s.charAt(i) == ' ' && count == k-1){
                    break;
                }

                if(s.charAt(i) == ' '){
                    count++;
                }

                trunc += s.charAt(i);
            }
        }
        return trunc;
    }
}
