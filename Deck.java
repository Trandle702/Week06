package Week06;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	/*Class Fields*/
	private List<Card> listOfCards = new ArrayList<Card>();	//a deck of 52 Cards
	
	/*Class Constructor*/
	public Deck() {
		String suit = "";
		
		//populating the listOfCards <ArrayList> with 52 Cards
		for(int i = 1; i <= 4; i++) {
			for(int j = 2; j <= 14; j++) {
				
				//based off the current value of i, will set the suit of the current card
				switch(i) {
					case 1: suit = "Hearts";
							break;
					case 2: suit = "Diamonds";
							break;
					case 3: suit = "Spades";
							break;
					case 4: suit = "Clubs";
							break;
				}
				
				//based off the current value of j, will add a new Card object in the listOfCards <ArrayList>
				//that has a suit based on the above switch statement, and a numerical value based on j
				switch(j) {
					case 2: listOfCards.add(new Card("Two of " + suit, 2));
							break;
					case 3: listOfCards.add(new Card("Three of " + suit, 3));
							break;
					case 4: listOfCards.add(new Card("Four of " + suit, 4));
							break;
					case 5: listOfCards.add(new Card("Five of " + suit, 5));
							break;
					case 6: listOfCards.add(new Card("Six of " + suit, 6));
							break;
					case 7: listOfCards.add(new Card("Seven of " + suit, 7));
							break;
					case 8: listOfCards.add(new Card("Eight of " + suit, 8));
							break;
					case 9: listOfCards.add(new Card("Nine of " + suit, 9));
							break;
					case 10: listOfCards.add(new Card("Ten of " + suit, 10));
							break;
					case 11: listOfCards.add(new Card("Jack of " + suit, 11));
							break;
					case 12: listOfCards.add(new Card("Queen of " + suit, 12));
							break;
					case 13: listOfCards.add(new Card("King of " + suit, 13));
							break;
					case 14: listOfCards.add(new Card("Ace of " + suit, 14));
							break;
				}
			}
		}
	}
	
	/*Class public methods*/
	//will randomize the elements of the listOfCards <ArrayList>
	public void shuffle() {
		System.out.println("Shuffling the deck!\n");
		Collections.shuffle(listOfCards);
	}
	
	//will remove the top element (Card) from the top of the listOfCards <ArrayList> (Deck)
	//and returns it when called
	public Card draw() {
		return listOfCards.remove(0);
	}
}
