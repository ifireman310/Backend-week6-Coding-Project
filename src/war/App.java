package war;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		
		// Instantiate a new deck of cards
		Deck deck = new Deck();
		
		// Instantiate two new players
		Player player1 = new Player("Ian");
		Player player2 = new Player("Gabi");
		
		// Shuffle the deck of cards
		deck.shuffle();
		
		for (int i = 0; i < 26; i++) {
			player1.draw(deck);
			player2.draw(deck);
		}
		
		
		System.out.println("\n\nLet the games begin!");
		
		for (int i = 0; i < 26; i++) {
			
			int round = i+1;
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			
			System.out.println("Round " + round + " of 26");
			System.out.print(player1.getName() + "'s card: ");
			card1.describe();
			System.out.print(player2.getName() + "'s card: ");
			card2.describe();
			
			if (card1.getValue() > card2.getValue()) {
				player1.incrementScore();
				System.out.println(player1.getName() + " WINS!");
			} else if (card1.getValue() < card2.getValue()) {
				player2.incrementScore();
				System.out.println(player2.getName() + " WINS!");
			} else {
				// Tie
				System.out.println("TIE! No point was awarded.");
			}
			printScore(player1,player2);
		}
		
		System.out.println();
		printFinalScore(player1,player2);
		
	}

	
	public static void printScore(Player player1, Player player2) {
		
		System.out.print("The current score is: ");
		System.out.println(player1.getName() + ": " + player1.getScore() + ", " + player2.getName() + ": " + player2.getScore());
		
	}
	
	public static void printFinalScore(Player player1, Player player2) {
		System.out.println("FINAL SCORE:"); // "Player 2 -- " + player2.getName() + ": " + player2.getScore());
		System.out.println("Player 1 -- " + player1.getName() + ": " + player1.getScore());
		System.out.println("Player 2 -- " + player2.getName() + ": " + player2.getScore());
		
		if (player1.getScore() > player2.getScore()) {
			// Player 1 wins
			System.out.println("Player 1 -- " + player1.getName() + " wins!");
		} else if (player2.getScore() > player1.getScore()) {
			// Player 2 wins
			System.out.println("Player 2 -- " + player2.getName() + " wins!");
		} else {
			// Draw
			System.out.println("Draw!");
		}
		
	}
}
