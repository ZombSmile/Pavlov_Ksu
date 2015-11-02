import java.util.*;
 class Time2
 {
public static int sum(int m, int n) {
        if (m > n) {
            return 0 ;
        }
        return m + sum(m + 1, n);
    }
    }