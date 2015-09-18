//Sam Forman
// Lab 4
//lab04
//
// first compile the program
//     javac lab04.java
// run the program
//     java lab04.java//

// define a class


public class CardGenerator{
    			// main method required for every Java program
   			public static void main(String[] args) {
   			
   			int upperBound = 13;
            int suit = (int)(Math.random()*4)+1;
            int rank = (int)(Math.random()*(upperBound)+1);
            
            String outputSuit = " ";
            String outputRank = " ";
         
   
     if (suit == 1){
    outputSuit = "Spades";
     }
    if (suit == 2){
    outputSuit = "Clubs";
    }
    if (suit == 3){
    outputSuit = "Diamonds";
    }
    if (suit == 4){
    outputSuit = "Hearts";
    }
    
    
    switch(rank){
    case 1:
    outputRank = "Ace";
    break;
    
    case 2:
    outputRank = "2";
    break;
    
    case 3:
    outputRank = "3";
    break;

    case 4:
    outputRank = "4";
    break;
    
    case 5:
    outputRank = "5";
    break;
    
    case 6:
    outputRank = "6";
    break;
    
    case 7:
    outputRank = "7";
    break;
    
    case 8:
    outputRank = "8";
    break;
    
    case 9:
    outputRank = "9";
    break;
    
    case 10:
    outputRank = "10";
    break;
    
    case 11:
    outputRank = "Jack";
    break;
    
    case 12:
    outputRank = "Queen";
    break;
    
    case 13:
    outputRank = "King";
    break;
       
        }
        
        System.out.println(outputRank +" "+ "of"+ " "+ outputSuit);
    }
}
   			