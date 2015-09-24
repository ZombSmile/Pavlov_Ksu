public class exampleHW1
 {
	public static void main(String[] args) {
		double x = Double.valueOf(args[0]);
        double y = Double.valueOf(args[1]);
    	double v, p, result = 0;   
    	v = (x * x * x * x * x * x + y * y * y * y * y * y * y - 37);
    	p = (4 / 3 + 5 * x / 2 - 74);
    	if (p==0){
        	System.out.println("Error");
    		}
    	else{
        	result  = v / p - y * y / 2 - x * y;
         	System.out.print(result);
    		}
    	     
         
   }     
}