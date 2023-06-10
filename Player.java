package Week06;

import java.util.List;
import java.util.ArrayList;

public class Player {
	/*Class Fields*/
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	/*Class Constructor*/
	public Player(String name) {
		this.setName(name);
		setScore(0);
	}
	
	/*Class public methods*/
	//will print to the screen the Player's name and all the cards in their hand
	public void describe() {
		System.out.print("Player " + name + " has these cards in their hand: ");
		for(Card card: hand) {
			card.describe();
		}
	}
	
	//will remove the top element (Card) from the top of the hand <ArrayList> (Deck)
	//and returns it when called 
	public Card flip() {
		return hand.remove(0);
	}
	
	//will remove the top element (Card) from the top of the deck (Deck) and will
	//add the card to the player's hand
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	//increments the player's score by one
	public void incrementScore() {
		score += 1;
	}

	/*Class getters and setters*/
	//will return the player's score
	public int getScore() {
		return score;
	}
	
	//will set the player's score
	public void setScore(int score) {
		this.score = score;
	}

	//will return the player's name	
	public String getName() {
		return name;
	}

	//will set the player's name
	public void setName(String name) {
		this.name = name;
	}
}
