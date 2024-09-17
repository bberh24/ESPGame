
/*
	Class: CMSC203
	Description: ESPGame.java reads and displays colors.txt, 
	then allows user play color guessing game
	Due: 09/16/2024
	Platform: Eclipse
	Name: Benjamin Berhanu
*/
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ESPGame {

	public static void main(String[] args) {
        
		final String COLOR_BLACK = "Black";
		final String COLOR_WHITE = "White";
		final String COLOR_GRAY = "Gray";
		final String COLOR_SILVER = "Silver";
		final String COLOR_MAROON = "Maroon";
		final String COLOR_RED = "Red";
		final String COLOR_PURPLE = "Purple";
		final String COLOR_FUCHSIA = "Fuchsia";
		final String COLOR_GREEN = "Green";
		final String COLOR_LIME = "Lime";
		final String COLOR_OLIVE = "Olive";
		final String COLOR_YELLOW = "Yellow";
		final String COLOR_NAVY = "Navy";
		final String COLOR_BLUE = "Blue";
		final String COLOR_TEAL = "Teal";
		final String COLOR_AQUA = "Aqua";
		
		Scanner sc = new Scanner(System.in);
		String filename;
		System.out.println("CMSC203 Assignment1: Test your ESP skills!");
		System.out.print("Enter the filename: ");
		filename = sc.nextLine();
		Path file = Paths.get(filename);
//		File file2 = new File(filename);
//		System.out.println(file2.exists());
		// true for ide, false for terminal
		try {
			// I'm used to using this instead of Scanner
            InputStream iStream = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(iStream));
            System.out.println("There are sixteen colors from a file: ");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
		catch(IOException e)
		{
			System.out.println("Error reading file: " + e.getMessage());
		}
		Random randomNumbers = new Random();
		int score = 0;
		// separates contents in file from game
		System.out.println();
		for(int round = 1; round <=3; round++)
		{
			System.out.println("Round " + round);
			System.out.println("\nI am thinking of a color.");
			System.out.println("Is it one of list of colors above?");
			// random position between 1 and 17 exclusive (1-16)
			int colorPos = randomNumbers.nextInt(17)+1;
			String color = "";
			// couldn't use switch expression
			switch(colorPos)
			{
				case 1:
					color = COLOR_BLACK;
					break;
				case 2:
					color = COLOR_WHITE;
					break;
				case 3: 
					color = COLOR_GRAY;
					break;
				case 4:
					color = COLOR_SILVER;
					break;
				case 5:
					color = COLOR_MAROON;
					break;
				case 6:
					color = COLOR_RED;
					break;
				case 7:
					color = COLOR_PURPLE;
					break;
				case 8:
					color = COLOR_FUCHSIA;
				case 9:
					color = COLOR_GREEN;
					break;
				case 10:
					color = COLOR_LIME;
					break;
				case 11:
					color = COLOR_OLIVE;
					break;
				case 12:
					color = COLOR_YELLOW;
					break;
				case 13:
					color = COLOR_NAVY;
					break;
				case 14:
					color = COLOR_BLUE;
					break;
				case 15:
					color = COLOR_TEAL;
					break;
				case 16:
					color = COLOR_AQUA;
					break;
			}
			System.out.print("Enter your guess: ");
			String userGuess = sc.nextLine();
			System.out.println("\nI was thinking of "+color+".");
			if(userGuess.equalsIgnoreCase(color))
			{
				score++;
			}		
		}
		System.out.println("Game Over");
		System.out.println("\nYou guessed "+score+" out of 3 colors correctly");

		System.out.print("Enter your name: ");
		String userName = sc.nextLine();
		System.out.print("Describe yourself: ");
		String description = sc.nextLine();
		System.out.print("Due Date: ");
		String dueDate = sc.nextLine();
		
		System.out.println("User Name: "+ userName);
		System.out.println("User Description: "+ description);
		System.out.println("Date: "+ dueDate);



	}

}
