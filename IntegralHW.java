class IntegralHW {
		public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Add x1,x2 and SHAG for y=x*x+8*x");
		double x1 = in.nextInt();
		double x2 = in.nextInt();
		double shag = in.nextInt(); //с шагом нужен массив
		double y1 ;
		double y2 ;
		double res ;
		y1 = x1 * x1 * x1 + 4 * x1 * x1;
		y2 = x2 * x2 * x2 + 4 * x2 * x2;
		res = (Math.max(x2,x1) - Math.min(x1,x2)) * (y1 + y2) / 2 ;
		System.out.println(res);


} 
}