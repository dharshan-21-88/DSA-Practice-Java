//https://leetcode.com/problems/count-items-matching-a-rule/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatchingRule {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<List<String>> items = new ArrayList<>();
        String ruleKey = in.next();
        String ruleValue = in.next();
        System.out.println(countMatches(items,ruleKey,ruleValue));
        in.close();
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index;
        int match = 0;
        if(ruleKey.equals("type")){
            index=0;
        }
        else if(ruleKey.equals("color")){
            index=1;
        }
        else if(ruleKey.equals("name")){
            index=2;
        }
        else{
            index =-1;
        }
        for (int i = 0; i < items.size(); i++) {
            String value = items.get(i).get(index);
            if(value.equals(ruleValue)){
                match++;
            }
        }
        return match;
    }
}
