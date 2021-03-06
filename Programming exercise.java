- /*  Write a program that reads strings from the user until the user inputs
the string "end". At that point, the program should print how many
strings have been read. The string "end" should not be included in the
number strings read. You can find some examples below of how the
program works. */

Scanner scanner = new Scanner (System .in );
		int sum = 0;
		
		while (true ) {
		 String line = scanner.next();
		 sum +=1;
		 if (line .equals ("end" )) {  break ; }}
		
		System.out.print(sum-1);
    
____________________________________________________________________________
- /* Write a program that reads strings from the user until the user inputs
the string "end". As long as the input is not "end", the program should
handle the input as an integer and print the cube of the number */

Scanner scanner = new Scanner (System .in );
		
		while(true) {
			String input = scanner.next();
			if (input.equals("end")) {break;}
			
			int number = Integer .valueOf(input);
			System.out.println(number*number*number);

____________________________________________________________________________
- /* Write a program that prints the contents of a file called "data.txt",
such that each line of the file is printed on its own line.*/
	
package practical;
import java.io.*;
import java.util.Scanner; 

public class Practical {

	public static void main(String[] args) throws IOException  
{
    Scanner scanner = new Scanner (System .in );
	
    File file = new File("/home/username/fileName.txt"); 	  
    Scanner sc = new Scanner(file); 
    while (sc.hasNextLine()) 
	System.out.println(sc.nextLine());
		  

}
}
____________________________________________________________________________
- /* Write a program that asks the user for a string, and then prints the
contents of a file with a name matching the string provided. You may
assume that the user provides a file name that the program can find.*/
	
package practical;
import java.io.*;
import java.util.Scanner; 

public class Practical {

	public static void main(String[] args) throws IOException  
{
	Scanner scanner = new Scanner (System .in );
	System.out.print("Which file should have its contents printed?\n- ");
	String fileName = scanner.next();
	
	File file = new File ("/home/username/"+fileName+".txt");
	Scanner content = new Scanner(file);
	
	while (content.hasNextLine()) {
		System.out.println(content.nextLine());
	}

}
}

/* make sure all files in the same main path */
____________________________________________________________________________

			
