package War;

public class Card {

	private int value;

	private String name;
	private String rank; 
	private String suit;
	
	
	
	// public static String[] suits = {
	//	        "Clubs", "Diamonds", "Hearts", "Spades"};
	
	public Card(int val, String suitVal) {
		this.value = val;
		this.suit = suitVal;
		this.name = this.findRank(value) + " of " + this.suit;
		
}
	
	

	

	public void describe() {
	System.out.println(name);
	}

	private String findRank(int value) {

		if (value == 2) {
			rank = "Two";
		} else if (value== 3) {
			rank = "Three";
		} else if (value == 4) {
			rank = "Four";
		} else if (value == 5) {
			rank = "Five";
		} else if (value == 6) {
			rank = "Six";
		} else if (value == 7) {
			rank = "Seven";
		} else if (value == 8) {
			rank = "Eight";
		} else if (value == 9) {
			rank = "Nine";
		} else if (value == 10) {
			rank = "Ten";
		} else if (value == 11) {
			rank = "Jack";
		} else if (value == 12) {
			rank = "Queen";
		} else if (value == 13) {
			rank = "King";
		} else if (value == 14) {
			rank = "Ace";
		}
		return rank;
	}
	
	

	public int getValue() {
		return this.value;
	}
	
	public void setValue(int value) {
		this.value = value;	
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRank() {
		return this.rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
}

