package bitwise;

public class XORofZerotoA {
    public static void main(String[] args) {
        int a = 7;

        System.out.println(brute(a));
        System.out.println(optimal(a));
    }

    static int optimal(int a){ // Solve on a paper you'll get it (there is a pattern for every 4 no.s)
        if(a % 4 == 0){
            return a; // XOR of 0 = no. itself
        }
        else if(a%4==1){
            return 1;
        }
        else if(a%4==2){
            return a+1;
        }
        else{ // a % 3 == 0
            return 0;
        }
    }

    static int brute(int a){
        int ans = 0;
        for (int i = 0; i <= a; i++) {
            ans ^= i;
        }
        return ans;
    }
}
