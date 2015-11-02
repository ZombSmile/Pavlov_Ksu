class Polyndrom
 {  
   public static void main(String[] args) {
    StringBuilder str = new StringBuilder(args[0]);

    if(hasLetters(str)) 
    {
    	System.out.println("Не только цифры!");
    	return;
    }

    if(str.length() == 1)
    {
    	System.out.println(false);
    	return;
    }


    int center = str.length() / 2;
    if(str.length() % 2 != 0)
    	str.delete(center, center + 1);

    StringBuilder str2 = new StringBuilder(str.substring(0, center));
    str.delete(0, center);
    str.reverse();

    System.out.println(str.toString().equals(str2.toString()));
   }

   static boolean hasLetters(StringBuilder str)
   {
   	for(int i = 0; i < str.length(); i++)
   	{
   		if(str.charAt(i) < 48 || str.charAt(i) > 57) return true;
   	}
   	return false;
   }
 }