import java.util.*;
 class Time
 {
 	public static void main(String[] args) {
 		int a = 0;
        int n = Integer.valueOf(args[0]);
        double timeOne = System.nanoTime();    
 		for (int i = 1; i <= n; i++) {
            a = a + i ;
            }
        double differece = System.nanoTime() - timeOne;
        System.out.format("Time used for sorting: %.5fms\n", differece);
   
        System.out.println(a);
          }
    public static int sum(int m, int n) {
    if (m > n) {
        return 0 ;
    }
        return m + sum(m + 1, n);
    }


}
