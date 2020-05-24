
package War;

import java.util.Arrays;

import java.util.Random;
import java.util.Scanner;

public class App {
	static Scanner scanner = new Scanner(System.in);

	public static String player1Name = "";
	public static String player2Name = "";

	public static void main(String[] args) {
		System.out.println("hello world");

		// Scanner scanner = new Scanner(System.in);

		Deck deck = new Deck();
		// deck.shuffle();

		Player playerObj = new Player();

		int choice = 0;

		while (choice != -1) {

			showMenu();

			choice = getUserChoice();
			if (choice == 1) {
				enterPlayernames();
			} else if (choice == 2) {
				deck.shuffle();		
			} else if (choice == 3) {
				beginGame(deck, playerObj);
			}

			// Card cardObj = shuffleDeck.draw(cards);
			// System.out.println(Arrays.toString(cards));

		}
	}

	private static void enterPlayernames() {
		System.out.println("Enter Player 1 name: ");
		player1Name = scanner.next();
		System.out.println("Enter Player 2 name: ");
		player2Name = scanner.next();
	}

	public static int getUserChoice() {
		return scanner.nextInt();
	}

	public static void showMenu() {
		System.out.println("1) Enter Player names");
		System.out.println("2) Shuffle cards");
		System.out.println("3) Begin game");
	}

	public static void beginGame(Deck deckObj, Player playerObj) {

		int player1Score = 0;
		int player2Score = 0;

		Card[] player1Hand = deckObj.getPlayer1Hand();
		Card[] player2Hand = deckObj.getPlayer2Hand();

		for (int i = 0; i < player1Hand.length; i++) {
			playerObj.draw(deckObj, player1Hand);
		}

		for (int i = 0; i < player2Hand.length; i++) {
			playerObj.draw(deckObj, player2Hand);
		}

		for (int i = 0; i < 26; i++) {

			if (player1Hand[i].getValue() > player2Hand[i].getValue()) {
				player1Score++;
				// player1Score.incrementScore;
			} else if (player2Hand[i].getValue() > player1Hand[i].getValue()) {
				player2Score++;
				// player2Score.incrementScore();
			}
		}
		
		displayScore(player1Score, player2Score);
		
	}

	public static void displayScore(int player1Score, int player2Score) {
		

		System.out.println(player1Name + ": " + player1Score);
		System.out.println(player2Name + ": " + player2Score);
		if (player1Score > player2Score) {
			System.out.println(player1Name + " wins");
		} else if (player2Score > player1Score) {
			System.out.println(player2Name + " wins");
		} else {
			System.out.println("Draw");
		}

	}
}
