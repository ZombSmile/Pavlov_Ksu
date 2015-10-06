class er4{
	public static void main(String[] args) {
		boolean[] a;
        int n = Integer.valueOf(args[0]);
        int i,j,k;
        a = new boolean[n];
        for (i=0;i<n ;i++ ) {
            a[i] = true;
            //System.out.println(a[i]);
        }               
                for (i=2;i<n ;i++ ) {
                    for (j=i+1;j<n ;j++ ) {
                                if (j % i == 0) {
                                a[j] = false;
                            }
            }
        for (i=2;i<n ;i++ ) {
            if (a[i]) {
                System.out.println(i);
            }
        }
	}
}
}