import java.io.*;
import java.util.Scanner;

public class ducciSequence {

	public static void main(String[] args) throws IOException {
		
		//Read from file
		File file = new File("ducci.txt");
		Scanner scan = new Scanner(file);
				
		//declare a bunch of variables
	    String wholeLine = "",
	    	partLine = "",
	    	split[];
	    
	    int number[],
	    	difference,
	    	length,
	    	i = 1;
	    
	    
		//Read each line
		while (scan.hasNextLine()) {
			
			wholeLine = scan.nextLine();
			//to get rid of the last ) and because arrays start at 0
			length = (wholeLine.length() - 2);
			
			//to get rid of the ()
			while (length >= i) {
				partLine = partLine + wholeLine.charAt(i);
				i++;
			}
			
			split = partLine.split(", ");
			length = split.length;
			
			System.out.println(length);
		}
		
		//close scanner
		scan.close();
		
		}

}
