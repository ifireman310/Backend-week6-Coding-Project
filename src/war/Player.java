package war;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand;
	private int score;
	private String name;
	
	// Constructor
	public Player(String name) {
		this.name = name;
		this.score = 0;
		this.hand = new ArrayList<>();
	}
	
	
	// GETTERS & SETTERS:
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public List<Card> getHand(){
		return this.hand;
	}
	
	public void setHand(List<Card> hand){
		this.hand = hand;
	}
	
	
	// METHODS
	public void describe() {
		System.out.println("Player name: \t" + this.name);
		System.out.println("Player score: \t" + this.score);
		System.out.println("Remaining cards:");
		for (Card card : this.hand) {
			card.describe();
		}	
	}
	
	public int getNumberOfCardsInHand() {
		return this.hand.size();
	}
	
	public Card flip() {
		if (getNumberOfCardsInHand() > 0) {
			Card card = this.hand.remove(0);
			return card;
		} else {
			// TODO: Throw an exception if user attempts to draw a card with no cards left in the deck
			return null;
		}
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		this.score += 1;
	}
	
}
