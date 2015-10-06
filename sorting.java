import java.util.Arrays;

public class sorting {
public static void main(String[] args) {

	int n = Integer.valueOf(args [0]), j = n;
	int[] a = new int[n];
	for (int i = 0; i < n; i++) {
      a[i] = (int) Math.round(Math.random() * 100);
    }
	
	System.out.println(Arrays.toString(a));
		while ( j > 0 ) {
			j--;
			for( int i = 0; i < n-j; i++){
				if(a[i]>a[i+j]){
					int p = a[i];
					a[i] = a[j+i];
					a[j+i] = p;
				}
			}
		}
		System.out.print(Arrays.toString(a));


} 
}