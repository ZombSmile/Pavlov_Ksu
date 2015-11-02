class ABCorBCA
 {  
   public static void main(String[] args) {
    
   	if(args.length == 0)
   	{ 
   		System.out.println("Введите строку в качестве параметра");
   		return;
   	}

   	for(int i = 1; i < args[0].length(); i++)
   	{
   		if(args[0].charAt(i) < args[0].charAt(i - 1))
   		{
   			System.out.println("Не по алфавиту");
   			return;
   		}
   	}

    System.out.println("По алфавиту");
   }
 }