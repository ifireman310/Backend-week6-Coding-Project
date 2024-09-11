package war;

public class Card {

	private String name;
	private String suit;
	private int value;
	
	// Constructor
	public Card(String suit, int value) {
		
		this.suit = suit;
		this.value = value;
		String nameStart;
		
		if (value == 11) {
			// Jack
			nameStart = "Jack";
		} else if (value == 12) {
			// Queen
			nameStart = "Queen";
		} else if (value == 13) {
			// King
			nameStart = "King";
		} else if (value == 14) {
			// Ace
			nameStart = "Ace";
		} else {
			// Regular number 2-10
			nameStart = Integer.toString(value);
		}
		
		this.name = nameStart + " of " + suit + "s";
	}
	
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	
	// Methods
	public void describe() {
		System.out.println(name);
	}
	
}
