import java.util.Scanner;
class ellipseHW {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int r      = in.nextInt(); 
		for (int x = 1; x <= 2 * r + 1; x++){
			for (int y = 1; y <= 2 * r + 1; y++){
				if ((x - r - 1) * (x - r - 1) + (y - r - 1) * (y - r - 1) <= r * r)
				System.out.print("o");
				else
				System.out.print(" ");
}
				System.out.println();
}




}
}