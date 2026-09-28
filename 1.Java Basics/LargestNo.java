public class LargestNo{
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int c = 68;

    //    int max = a;
        
    //     if (b>a){
    //         max = b;
    //     }
    //     if (c>a){
    //         max = c;
    //     }

    // int max = 0;

    // if (a>b){
    //     max = a;
    // }
    // else {
    //     max= b;
    // }
    // if(c >max){
    //     max = c;
    // }

    int max = Math.max(c,Math.max(a, b));
    System.out.println(max);
   }
}

