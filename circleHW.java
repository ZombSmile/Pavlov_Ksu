import java.util.Scanner;
class circleHW{
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Add radius;x,y of centre cyrcle;x,y of dote");
	int r  = in.nextInt(); 
	int x  = in.nextInt(); 
	int y  = in.nextInt(); 
	int x1 = in.nextInt(); 
	int y1 = in.nextInt(); 
 		if ((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y) < r * r) {
		System.out.println("Inside");
}
		else{ 
				if ((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y) == r * r)
				System.out.println("In");
				else
				System.out.println("Outside");
}
}
}