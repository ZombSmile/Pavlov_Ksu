public class tableHW
{
	public static void main(String[] args) {
	int i, j, r;
	String s, r1;
	for (i = 1; i < 10; i++) {
	for (j = 1; j < 10; j++) {
	r = i * j;
	s = String.valueOf(i) + "x" + String.valueOf(j) + "=" + String.valueOf(r) + " ";
	if (r < 10) {
	s = s + " ";
}
	System.out.print(s);
}
	System.out.println();
}
}
}