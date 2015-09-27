import java.util.Scanner;
class rombHW {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a      = in.nextInt(); 
    	for (int i = 1;i <= 2 * a + 1;i++){
			for (int j = 1;j <= 2 * a + 1;j++){
				if (i <= a + 1){
					if ((j > a - i + 1) && (j < a + i + 1))
					System.out.print("o");
					else
					System.out.print(" ");
}
				else{
					if ((j > i - a - 1) && (j < 3 * (a + 1) - i))
					System.out.print("o");
					else
					System.out.print(" ");
}

}
					System.out.println();
}

}
}