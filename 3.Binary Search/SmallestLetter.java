//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters,target));
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length-1;

        while(s<=e){
            int mid = s + (e-s)/2;
            if(letters[mid] <= target){
                s = mid + 1;
            }
            else if(letters[mid] > target){
                e = mid - 1;
            }
        }
        return letters[s % letters.length];
    }
}
