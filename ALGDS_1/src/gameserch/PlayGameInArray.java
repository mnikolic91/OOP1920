package gameserch;

import java.util.Arrays;
import java.util.Scanner;

public class PlayGameInArray {

	public static void playGuessGame(int maxTrials, int arrSize, int bottom, int upper) {
		int cntr = 1;
		boolean gameStatus = true;
		Scanner sc = new Scanner(System.in);
		int guess;
		int[] arr = AlgBasic.generateArray(arrSize, bottom, upper);
		SearchRslt res;

		while (gameStatus) {
			System.out.println("Molimo Vas unesite broj od " + bottom + " do " + upper);
			guess = sc.nextInt();
			res = AlgBasic.isValueInArray(guess, arr);
			cntr++;

			if (cntr <= maxTrials) {
				if (res.isStatus()) {
					System.out.println(Arrays.toString(arr));
					System.out.println(res.toString());
					System.out.println("Won game! Iteration " + cntr);
					gameStatus = false;

				} else {
					sc.hasNextLine();
					System.out.println("Try again.");
				}

			} else {
				gameStatus = false;
				System.out.println(Arrays.toString(arr));
				System.out.println("You lost. Game over!");
			}
		}
		sc.close();
	}
}
