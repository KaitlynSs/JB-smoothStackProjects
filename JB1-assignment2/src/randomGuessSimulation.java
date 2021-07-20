import java.io.InputStreamReader;
import java.util.Scanner;

public class randomGuessSimulation {
	private static Scanner scanner;

	public static void main(String args[]) {
		scanner = new Scanner(new InputStreamReader(System.in));
		int round = 1;
		int exit = 0;
		int guesses[] = new int[6];
		int randNum = (int) (Math.floor(Math.random() * 100) + 1);
		
		System.out.println("Guess a number between 1-100"
				+ "\nyou have 5 tries to get within 10 of the correct number\n");
		
		while (round <= 5) {

		int input = scanner.nextInt();
		
		if (input == randNum) {
			System.out.println("Congradulations, you guessed the random number correctly!\n"
					+ "it only took you " + round + " tries");
			exit = 1;
		}else if (input > randNum && input < randNum + 11) { 
			System.out.println("Good job, your guess was within 10 of the random number\n"
					+ "your guess = " + input + "     random number = " + randNum + "\n"
					+ "off by " + (input - randNum));
			exit = 1;
		}else if (input < randNum - 11 && input > randNum) {
			System.out.println("Good job, your guess was within 10 of the random number\n"
					+ "your guess = " + input + "     random number = " + randNum + "\n"
					+ "off by " + (randNum - input));
			exit = 1;
		}else {
			System.out.println("Nice try, you guess wasn't within 10 of the random number\n"
					+ "try agian");
			guesses[round] = input;
		}
		
		if (exit == 1) 
			round = 9;
		
		round++;
		}
		
		if (round == 6) {
			System.out.println("To bad, you were unable to find the random number in 5 tries\n"
					+ "the number was" + randNum + "\n"
					+ "your guesses...");
			for (int i = 1; i <= 5; i++) {
				System.out.println("   " + i + ") " + guesses[i]);
			}
		}
	}
}
