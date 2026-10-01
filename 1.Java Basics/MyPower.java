//https://leetcode.com/problems/powx-n/
public class MyPower {
    public static void main(String[] args) {
        double x = 2;
        int n = 10;
        System.out.println(myPow(x, n));
    }
    static double myPow(double x, int n) {
        if(x == 0){
            return 0;
        }

        if(n >= 0){
            return powerCalc(x, n);
        }

        else{
            x = 1/x;
            n *= -1;
            return powerCalc(x, n);
        }
    }

    static double powerCalc(double x, int n){       // O(n)
        double power = 1;
        while(n > 0){
                power = power * x;
                n--;
            }
        return power;
    }

    static double powerCalc1(double x, int n){      // O(log n)
        double power = 1;
        while(n > 0){
                if(x % 2== 1){

                }
                
                power = power * x;
                n /= 2;
            }
        return power;
    }
}
