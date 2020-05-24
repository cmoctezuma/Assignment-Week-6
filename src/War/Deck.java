package War;

import java.util.Random;

public class Deck {

	Card[] deck = new Card[52];

	Card[] player1Hand = new Card[26];
	Card[] player2Hand = new Card[26];

	private int drawIdx = 0;

	public Deck() {
		String[] suits = new String[4];
		suits[0] = "Clubs";
		suits[1] = "Diamonds";
		suits[2] = "Hearts";
		suits[3] = "Spades";

		int index = 0;
		{
			for (int suit = 0; suit <= 3; suit++) {
				for (int value = 2; value <= 14; value++) {
					deck[index] = new Card(value, suits[suit]);
				//	deck[index].describe(); 
					index++;

				}
			}
		}

	}

	

	// shuffle
	public void shuffle() {
		Random rand = new Random();

		for (int i = 0; i < deck.length; i++) {
			int randomIndexToSwap = rand.nextInt(deck.length);
			Card temp = deck[randomIndexToSwap];
			deck[randomIndexToSwap] = deck[i];
			deck[i] = temp;
		}
	}

	public Card draw() {
		/*
		 * for (int i =0; i <= deck.length; i++) {
		 * deck[index(i)].remove; } Card card;
		 */ 
		if (drawIdx > 51) {
			drawIdx = 0;
		}
		Card cardAtIndex = deck[drawIdx];
		drawIdx++;
		return cardAtIndex;
	}

	public Card[] getPlayer1Hand() {
		return player1Hand;
	}

	public Card[] getPlayer2Hand() {
		return player2Hand;
	}
	
}
