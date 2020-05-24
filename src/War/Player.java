package War;

import java.util.Scanner;

public class Player {

	Card[] hand = new Card[26];
	public int player1score;
	public int player2score;
	private int handIdx = 0;
	private int score = 0;
	public String name;
	//Deck deckObj = new Deck();

	public void describePlayer(Deck deck) {
		System.out.println("Player 1: " + player1score);
		System.out.println("Player 2: " + player2score);

		Card[] player1 = deck.getPlayer1Hand();
		Card[] player2 = deck.getPlayer2Hand();

		// Describing player 1's hand
		for (int i = 0; i < 26; i++) {
			player1[i].describe();
		}

		// Describing player 2's hand
		for (int i = 0; i < 26; i++) {
			player2[i].describe();
		}

	}

	public Card flip(Card[] playerHand) {
		Card nextCard = playerHand[handIdx];
		handIdx++;
		return nextCard;
	}

	public void draw(Deck deckObj, Card[] currentPlayerHand) {

		if (handIdx > 25) {
			handIdx = 0;
		}

		Card drawnCard = deckObj.draw();
		currentPlayerHand[handIdx] = drawnCard;
		handIdx++;

	}

	public void incrementScore() {
		score++;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
