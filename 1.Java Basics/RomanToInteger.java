//https://leetcode.com/problems/roman-to-integer/description/
public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    static int romanToInt(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            
            int current = inValue(s.charAt(i));
            if(i == s.length()-1){
                num+=current;
            }
            else{
                int next = inValue(s.charAt(i+1));

                if(current < next){
                    num-=current;
                }
                else{
                    num+=current;
                }
            }
        }
        return num;
    }

    static int inValue(char ch){
        if(ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        return 1000;
    }
}
