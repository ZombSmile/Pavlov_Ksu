public class control5 {

	public static void main(String[] args) {
		int[] a = new int[10];
		for(int i = 0; i <  a.length; i++) {
	    a[i] =  (int)(Math.random() * 100);
	    System.out.print(a[i] + "  ");
}
        System.out.print("\nSorted: \n");
		
		for (int i = 0; i < a.length/2; i++) {
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
			
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}

}