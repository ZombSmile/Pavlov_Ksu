class Matchi
 {  
   public static void main(String[] args) {
   	if(args.length < 2)  {
    	System.out.println("неверный формат");
    	return;
    }

   	StringBuilder nameCommand1 = new StringBuilder(args[0]);
    StringBuilder[] results = new StringBuilder[args.length - 1];
    for(int i = 0; i < args.length - 1; i++)
    {
    	results[i] = new StringBuilder(args[i + 1]);
    }

    int pos = nameCommand1.indexOf(":");
    if(pos == -1) pos = nameCommand1.indexOf("-");
    if(pos == -1) 
    {
    	System.out.println("неверный формат");
    	return;
    }
    StringBuilder nameCommand2 = new StringBuilder(nameCommand1.substring(pos + 1, nameCommand1.length()));
    nameCommand1.delete(pos, nameCommand1.length());

    int goals1 = 0, goals2 = 0;
    for(int i = 0; i < results.length; i++)
    {
    	pos = results[i].indexOf(":");
    	if(pos == -1) pos = results[i].indexOf("-");
    	if(pos == -1) 
	    {
	    	System.out.println("неверный формат");
	    	return;
	    }
    	goals1 += Integer.parseInt(results[i].substring(0, pos));
    	goals2 += Integer.parseInt(results[i].substring(pos + 1, results[i].length()));
    }
    System.out.println(nameCommand1.toString() + "-" + Integer.toString(goals1) + " " +
     nameCommand2.toString() + "-" + Integer.toString(goals2));
   }
 }