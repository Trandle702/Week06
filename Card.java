package Week06;

public class Card {
	/*Class Fields*/
	private String cardName;	//the card's name
	private int cardValue;		//the card's numerical value
	
	/*Class Constructor*/	public Card(String cardName, int cardValue) {
		this.cardName = cardName;
		this.cardValue = cardValue;
	}
	
	/*Class public methods*/
	//will print out the card's name and the numerical value associate with it
	public void describe(){
		System.out.print(cardName + " (" + cardValue + ")");
	}
	
	/*Class getters and setters*/
	//returns the card's name
	public String getCardName() {
		return cardName;
	}
	
	//sets the card's name
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	//returns the card's numerical value
	public int getCardValue() {
		return cardValue;
	}
	
	//sets the card's numerical value
	public void setCardValue(int cardValue) {
		this.cardValue = cardValue;
	}


}
