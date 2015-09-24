public class sumHW {
	public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        int i;
        double y, s = 0;
        for (i = 1;i <= n;i++)	{
        		y = 1.0 / ((2 * i - 1) * ( 2 * i - 1));
        		if (i%2==0) s = s - y;
        		else s = s + y;
        }	
        System.out.print("S");
        System.out.print(n);
        System.out.print("=");
        System.out.print(s);
	}   

}