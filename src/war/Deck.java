package war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> deck;
	private int numberOfCards;
	
	public Deck() {
		// Instantiate the standard 52 card deck
		
		this.deck = new ArrayList<>();
		
		for (int i = 2; i <= 14; i++) { 
			deck.add(new Card("Heart",i));
			deck.add(new Card("Spade",i));
			deck.add(new Card("Club",i));
			deck.add(new Card("Diamond",i));
		}
		numberOfCards = this.deck.size();
	}
	
	
	// Getters
	public Card getCardInDeck(int i) {
		// TODO: throw an exception if the user attempts to get a card outside the valid range
		return this.deck.get(i);
	}
	
	public int getNumberOfCards() {
		return this.numberOfCards;
	}
	
	public void describe() {
		for (Card card : this.deck) {
			card.describe();
		}		
	}
	
	public Card draw() {
		
		if (getNumberOfCards() > 0) {
			Card card = this.deck.remove(0);
			this.numberOfCards = this.deck.size();
			return card;
		} else {
			// TODO: Throw an exception if user attempts to draw a card with no cards left in the deck
			return null;
		}
	}
	
	public void shuffle() {
		Collections.shuffle(deck);	
	}
}
