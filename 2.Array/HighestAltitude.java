//https://leetcode.com/problems/find-the-highest-altitude/
public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }
    static int largestAltitude(int[] gain) {
        int[] altitudes = new int[gain.length+1]; 
        altitudes[0]=0; 
        int largest = altitudes[0];
        for(int i=1; i<gain.length+1; i++){
            altitudes[i] = gain[i-1]+altitudes[i-1];
            if(altitudes[i]>largest){
                largest = altitudes[i];
            }
        }
        return largest;
    }
}
