import java.util.Scanner;

		class physicsHW {
		public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double t = in.nextInt(); 
		double g = 9.81; 
		double h; 

			if (t<0){
			System.out.println("Time must be >= 0");
}
			h = (g * t * t) / 2;
			System.out.println("High = "+h);

}
}