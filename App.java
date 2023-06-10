package Week06;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();				//a deck of 52 Cards
		Player p1 = new Player("Tom");		//Player 1
		Player p2 = new Player("Sally");	//Player 2
		
		//Prints out introduction
		System.out.println("Welcome Player 1: " + p1.getName() + ", and Player 2: " + p2.getName() + "!\n");
		System.out.println("Lets get ready for a game of War!\n");
		
		//randomly shuffles the deck of 52 cards
		deck.shuffle();
		
		//Each player will take turns drawing from the deck
		//and adding the card to their hand
		for(int i = 0; i < 52; i++) {
			if(i % 2 == 0) {
				p1.draw(deck);
			}else {
				p2.draw(deck);
			}	
		}
		
		//The Game Begins
		System.out.println("Each player now has 26 cards each!\n");
		System.out.println("Ready...BEGIN!!!\n");
		
		Card p1CurrentCard;		//holds Player 1 current card
		Card p2CurrentCard;		//holds Player 2 current card
		
		for(int j = 0; j < 26; j++) {
			p1CurrentCard = p1.flip();
			p2CurrentCard = p2.flip();
			
			//Will print out Player 1's and Player 2's current card to the screen
			System.out.print(p1.getName() + " has the ");
			p1CurrentCard.describe();
			System.out.print("\n" + p2.getName() + " has the ");
			p2CurrentCard.describe();
			
			//Based on the value of Player 1's and Player's 2 current card
			//will print out who the winner is or if they have a draw
			if(p1CurrentCard.getCardValue() > p2CurrentCard.getCardValue()){
				p1.incrementScore();
				System.out.println("\n" + p1.getName() + " wins this match!");
			}else if(p1CurrentCard.getCardValue() < p2CurrentCard.getCardValue()){
				p2.incrementScore();
				System.out.println("\n" + p2.getName() + " wins this match!");
			}else {
				System.out.println("\nDRAW!");
			}
			
			//Prints out Player 1's and Player's 2 current score to the screen
			System.out.println("Current Score: " + p1.getName() + ": " + p1.getScore() + "\t" + p2.getName() + ": " + p2.getScore() + "\n");
		}
		
		//End of the Game
		//Will print out Player 1's and Player 2's final score
		System.out.println("End of the game!");
		System.out.println("FINAL SCORES!");
		System.out.println(p1.getName() + ", has " + p1.getScore() + " points");
		System.out.println(p2.getName() + ", has " + p2.getScore() + " points\n");
		
		//Prints out the winner of the game or if the game ended in a draw
		if(p1.getScore() > p2.getScore()) {
			System.out.println(p1.getName() + " Wins!");
		}else if (p1.getScore() < p2.getScore()){
			System.out.println(p2.getName() + " Wins!");
		}else {
			System.out.println("Draw!");
		}

	}

}
