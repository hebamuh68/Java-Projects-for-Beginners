- /*  Write a program that reads strings from the user until the user inputs
the string "end". At that point, the program should print how many
strings have been read. The string "end" should not be included in the
number strings read. You can find some examples below of how the
program works. */

Scanner scanner = new Scanner (System .in );
		int sum = 0;
		
		while (true ) 
		{
		 String line = scanner.next();
		 sum +=1;
		 if (line .equals ("end" )) {  break ; }
	    }
		
		System.out.print(sum-1);
    
    ____________________________
