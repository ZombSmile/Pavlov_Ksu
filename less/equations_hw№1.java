public static void main(String[] args) {
	double x1,x2;
	double a = args[0];
	double b = args[1];
	double c = args[2];
	double d = Math.sqr(b) - 4*a*c;
	   if (d>0) {
        x1 = (-b + Math.sqrt(d))/(2*a);
        x2 = (-b - Math.sqrt(d))/(2*a);
        System.out.println("x1 ="+x1);
        System.out.println("x2 ="+x2);           
       }
       if (d = 0) {
        x1 = -b/(2*a)
        System.out.println("x ="+x1); 
       }
       else {
           System.out.println("Решений нет");
       }

}