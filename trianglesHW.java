import java.util.Scanner;
class trianglesHW {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    int s      = in.nextInt(); 

		for (int i = 1; i <= 2 * s + 1; i++) {
			for (int j = 1; j <= 1 + 4 * s; j++) { 
				if ((i >= 1) && (i < s + 1)) { 
					if ((j > 2 * s + 1 - i) && ( j <= 2 * s + i))
						System.out.print("o");
				else
				System.out.print(" ");
}
					if (i == s + 1) 
					System.out.print(" ");
							if (i > s + 1){
								if ( ((j > 2 * s + 1 - i) && (j < i - 1 )) || ((j > 4 * s + 3 - i) && (j < 2 * s + 1 + i) ))
								System.out.print("o");
								else
								System.out.print(" ");

} 
} 


								System.out.println();
}
}
}