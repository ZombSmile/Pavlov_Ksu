//import java.util.Scaner;


public class equationNew {
public static void main(String[] args) {
	double x1,x2;
  StringBuilder equation = new StringBuilder (args[0]); 
  String s = "";
  int i = 0;
	double a;/* = Double.parseDouble (args[0])*/
	double b;/* = Double.parseDouble (args[1])*/
	double c;/* = Double.parseDouble (args[2])*/
  //System.out.println(equation.indexOf("x"));
	for (i = 0; i < equation.indexOf("x*x") ; i++ ) {
    s = s + equation.charAt(i);
  }
  a = Double.parseDouble(s);
  //System.out.println(a);
  s = "";
  equation.delete(0, equation.indexOf("x*x")+3);
  //System.out.println(equation);
  for (i =0; i < equation.indexOf("x") ; i++ ) {
    s = s + equation.charAt(i);
  }
  b = Double.parseDouble(s);
  s = "";
  //System.out.println(b);
  equation.delete(0, equation.indexOf("x")+1);
  for (i =0; i < equation.length() ; i++ ) {
    s = s + equation.charAt(i);
  }
  c = Double.parseDouble(s);


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