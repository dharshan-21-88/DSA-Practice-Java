public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    static int romanToInt(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (i < s.length() - 1 && ch == 'I' && s.charAt(i + 1) == 'V') {
                num += 4;
                i++;
            } else if (i < s.length() - 1 && ch == 'I' && s.charAt(i + 1) == 'X') {
                num += 9;
                i++;
            } else if (i < s.length() - 1 && ch == 'X' && s.charAt(i + 1) == 'L') {
                num += 40;
                i++;
            } else if (i < s.length() - 1 && ch == 'X' && s.charAt(i + 1) == 'C') {
                num += 90;
                i++;
            } else if (i < s.length() - 1 && ch == 'C' && s.charAt(i + 1) == 'D') {
                num += 400;
                i++;
            } else if (i < s.length() - 1 && ch == 'C' && s.charAt(i + 1) == 'M') {
                num += 900;
                i++;
            } else if (ch == 'I') {
                num += 1;
            } else if (ch == 'V') {
                num += 5;
            } else if (ch == 'X') {
                num += 10;
            } else if (ch == 'L') {
                num += 50;
            } else if (ch == 'C') {
                num += 100;
            } else if (ch == 'D') {
                num += 500;
            } else if (ch == 'M') {
                num += 1000;
            }
        }
        return num;
    }
}
