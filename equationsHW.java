public class equations_hw {
public static void main(String[] args) {
	double x1,x2;
  
	double a = Double.parseDouble (args[0]);
	double b = Double.parseDouble (args[1]);
	double c = Double.parseDouble (args[2]);
	double d = b * b - 4 * a * c;
	   if (d > 0) {
        x1 = (-b + Math.sqrt(d)) / (2 * a);
        x2 = (-b - Math.sqrt(d)) / (2 * a);
        System.out.println("x1 ="+x1);
        System.out.println("x2 ="+x2);           
       }
       if (d == 0) {
        x1 = - b / (2 * a);
        System.out.println("x ="+x1); 
       }
       if (d < 0) {
           System.out.println("Решений нет");
       }

}
}