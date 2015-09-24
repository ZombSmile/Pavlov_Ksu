public class exampleHW {
	public static void main(String[] args) {
		double x = Double.valueOf(args[0]);
        double y = Double.valueOf(args[1]);
    	double v, p, result = 0;   
    	v = (y * y * y * y * y * y + x * x * x * x * x * x * x - 64);
    	p = (x * y - y * y * y + 3);
    	if (p==0){
        	System.out.println("Error");
    		}
    	else{
        	result  = v / p - 72 * x + 1 / 8;
         	System.out.print(result);
    		}
    	     
         
   }     
}