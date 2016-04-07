import java.util.Scanner;
import java.lang.Math;

public class squaresCubes {

	public static void main(String[] args) {
		// App Title
		System.out.println("Learn your squares and cubes!" + "\n");
		// open scanner
		Scanner input = new Scanner(System.in);

		//varibles to calculate square and cube
		int squared = 2;
		int cubed = 3;
		
		//create while to check for repeat
		String keepGoing = "y";
		while (keepGoing.equalsIgnoreCase("y")) {
			// get integer from user
			int numbers = 1;
			System.out.println("Enter an integer: ");
			int x = input.nextInt();
			System.out.println("Number      Squared      Cubed");
			System.out.println("------      -------      ------");
			System.out.println("------      -------      ------" + "\n");
			for (int i = 0; i < x; i++) {
				int squaredResults = (int) Math.pow(numbers, squared);
				int cubedResults = (int) Math.pow(numbers, cubed);
				System.out.println(numbers + "       " + squaredResults + "      " + cubedResults);
				numbers++;
			}
			System.out.println("Continue y/n?");
			keepGoing = input.next();
		}
		//close scanner
		input.close();
	}

}
