import java.util.Random;
import java.util.Scanner;

public class diceRoller {

	public static void main(String[] args) {
		
		String input,
			split[];

		int numberOfDie,
			numberOfSides,
			i=0,
			result = 0;
		
		Random rand = new Random();

		Scanner scan = new Scanner (System.in);
		
		do {
			System.out.print("Enter what type of die you want to roll: ");
			input = scan.nextLine();
			
			split = input.split("d");
			
			numberOfDie = Integer.parseInt(split[0]);
			numberOfSides = (Integer.parseInt(split[1]) - 1);
		} while(numberOfSides<=1);

		while (i<numberOfDie) {
			result = result + (rand.nextInt(numberOfSides) + 1);
			i++;
		}
		
		scan.close();
		
		System.out.println("Your result is : " + result);

	}

}
