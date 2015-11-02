public class control2 {	
	private static final int b = 20;
	
	public static void main(String[] args) {
		int a = 0;
		while(a < b){
			for (int i = 0; i < b - a; i++) {
				System.out.print(" "); 
			}
			for (int i = 0; i < a * 2 + 1; i++) {  
				System.out.print("*");
			}
			System.out.println();
			a++;
		}
	}
}