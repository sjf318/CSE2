//Sam Forman
//CSE2
//
// hw10
// javac Shuffling.java
// run the program
// java Shuffling
// This program shuffles a deck of cards using arrays

import java.util.Scanner; //import scanner

public class Shuffling{
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);

    String[] suitNames={"C","H","S","D"};  //array with names of suits
    String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"}; //array of rank names
    String[] cards = new String[52]; //52 cards in a card deck
    String[] hand = new String[5]; //5 cards in my hand while playing

        for (int i=0; i<52; i++){
         cards[i]=rankNames[i%13]+suitNames[i/13]; //defines each card with a different rank and suit
        }
        printArray(cards);
        System.out.println("Shuffled"); //tells the user that you are shuffling the cards
        shuffle(cards);
        printArray(cards);
        System.out.println("Randomized hand:");
        hand = randomizeHand(cards);
        printArray(hand);
        } //end of the main method
 

public static void printArray(String [] cards){
    for (int j=0; j<cards.length; j++){
        System.out.print(cards[j]+" "); //prints out each card in the array with a space after
    }
    System.out.println(""); //adds space to separate cards
    return; //and return back to the main program
    }//end of printArray method


//this method "shuffle" will shuffle the cards into the deck and return the shuffled deck
public static String [] shuffle(String[]cards){
    for (int k=0; k<100; k++){
        int destination = (int)(Math.random()*52); //figures out which random card to pick
        String temp = cards[0]; 
        cards[0] = cards[destination]; //switches the values
        cards[destination] = temp;
        }
    return cards;
} //end of shuffle method



//method randomizeHand will pick 5 random cards from the shuffled deck for your hand
    public static String [] randomizeHand(String[] cards){
    int Card1 = (int)(Math.random()*52); //figure out which card to pick
    int Card2, Card3, Card4, Card5;
    do{
        Card2 = (int)(Math.random()*52);
    } while (Card2 == Card1); //repeats until Card 1 and 2 are different values
    do{
        Card3 = (int)(Math.random()*52);
    } while (Card3 == Card1 || Card3 == Card2); //repeats until Card 1 and 3, and Card 2 and 3 are different values
    do{
        Card4 = (int)(Math.random()*52);
    } while (Card4 == Card1 || Card4 == Card2 || Card4 == Card3); //repeats until the cards  are different values
    do{
        Card5 = (int)(Math.random()*52);
    } while (Card5 == Card1 || Card5 == Card2 || Card5 == Card3 || Card5 == Card4); //repeat until they all five of the cards are different values
    String [] hand = new String [5];
    hand[0] = cards[Card1];
    hand[1] = cards[Card2];
    hand[2] = cards[Card3];
    hand[3] = cards[Card4];
    hand[4] = cards[Card5];
    
    return hand;
}

  
  
}