import java.util.Scanner;
class NOD{
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Add x,y");
int x = in.nextInt(); 
int y = in.nextInt();
int xy = 1;


for (int i = Math.max(x,y); i >= 1;i--){
if ((x % i == 0) && (y % i == 0)) {
xy = i;
i = 1;
}
}
System.out.println(xy);
}
}