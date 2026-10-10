//https://leetcode.com/problems/perfect-number/
public class PerfectNo {
    public static void main(String[] args) {
        int num = 1;
        System.out.println(checkPerfectNumber(num));
    }

    static boolean checkPerfectNumber(int num) {

        if(num <= 1){
            return false;
        }
        int sum = 0;
        for (int i = 1; i*i <= num; i++) {
            if(num % i == 0){
                sum += i;

                if(num/i != i && num/i !=num){
                    sum += num/i;
                }
            }
        }
        return num == sum;
    }
}
