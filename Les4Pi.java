import java.util.Scanner;
class Les4Pi {
	public static void main (String[] args) {
	Scanner in = new Scanner(System.in);
	int n      = in.nextInt();
	double pi;
	pi = n * Math.sqrt(2 * (1 - Math.cos(Math.toRadians(360) / n))) / 2;
	System.out.println(pi);


}
}