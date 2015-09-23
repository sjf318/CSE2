//Sam Forman
//Poker Hand Check Program
//
// hw04
// javac PokerHandCheck.java
// run the program
// java PokerHandCheck//

import java.util.Scanner; //Scanner class


// define a class
public class PokerHandCheck{

 public static void main(String [] args) {
 
int Randomsuit1 = (int) (Math.random()*4+1); // produces an integer between [1,4]
int n1 = (int) (Math.random()*13+1); // produces an integer between [1,13]
String suit1 = "";
String rank1 = "";

int Randomsuit2 = (int) (Math.random()*4+1); // produces an integer between [1,4]
int n2 = (int) (Math.random()*13+1); // produces an integer between [1,13]
String suit2 = "";
String rank2 = "";

int Randomsuit3 = (int) (Math.random()*4+1); // produces an integer between [1,4]
int n3 = (int) (Math.random()*13+1); // produces an integer between [1,13]
String suit3 = "";
String rank3 = "";

int Randomsuit4 = (int) (Math.random()*4+1); // produces an integer between [1,4]
int n4 = (int) (Math.random()*13+1); // produces an integer between [1,13]
String suit4 = "";
String rank4 = "";

int Randomsuit5 = (int) (Math.random()*4+1); // produces an integer between [1,4]
int n5 = (int) (Math.random()*13+1); // produces an integer between [1,13]
String suit5 = "";
String rank5 = "";

//determine suit based on random generation
switch (Randomsuit1){
 case 1:
 suit1="Diamonds"; // prints Diamonds if you have a 1 in your hand
 break;
 case 2:
 suit1="Clubs";
 break;
 case 3:
 suit1="Hearts"; 
 break;
 case 4:
 suit1="Spades"; 
 break;
}

//determine rank based on randomly generated number
switch (n1){
 case 1:
 rank1 ="Ace"; // prints Ace if you have a 1 in your hand
 break;
 case 2:
 rank1 = "2";
 break;
 case 3:
 rank1 = "3";
 break;
 case 4:
 rank1 = "4";
 break;
 case 5:
 rank1 = "5";
 break;
 case 6:
 rank1 = "6";
 break;
 case 7:
 rank1 = "7";
 break;
 case 8:
 rank1 = "8";
 break;
 case 9:
 rank1 = "9";
 break;
 case 10:
 rank1 = "10";
 break;
 case 11:
 rank1 ="Jack";
 break;
 case 12:
 rank1 ="Queen"; 
 break;
 case 13:
 rank1 = "King"; 
 break;
}

 //determine suit based on a random number generation
 switch (Randomsuit2){
  case 1:
  suit2="Diamonds"; // prints Diamonds if you have a 1 in your hand
  break;
  case 2:
  suit2="Clubs";
  break;
  case 3:
  suit2="Hearts"; 
  break;
  case 4:
  suit2= "Spades"; 
  break;
 }

//determine rank based on a randomly generated number
 switch (n2){
  case 1:
  rank2 ="Ace"; // print out Ace if you have a 1
  break;
  case 2:
  rank2 = "2";
  break;
  case 3:
  rank2 = "3";
  break;
  case 4:
  rank2 = "4";
  break;
  case 5:
  rank2 = "5";
  break;
  case 6:
  rank2 = "6";
  break;
  case 7:
  rank2 = "7";
  break;
  case 8:
  rank2 = "8";
  break;
  case 9:
  rank2 = "9";
  break;
  case 10:
  rank2 = "10";
  break;
  case 11:
  rank2 ="Jack";
  break;
  case 12:
  rank2 ="Queen"; 
  break;
  case 13:
  rank2 = "King"; 
  break;
 }

//determine suit based on a random generation
switch (Randomsuit3){
 case 1:
 suit3="Diamonds"; // prints Diamonds if you have a 1 in your hand
 break;
 case 2:
 suit3="Clubs";
 break;
 case 3:
 suit3="Hearts"; 
 break;
 case 4:
 suit3="Spades"; 
 break;
}

//determine rank based on a randomly generated number
switch (n3){
 case 1:
 rank3 ="Ace"; // prints Ace if you have a 1 in your hand
 break;
 case 2:
 rank3 = "2";
 break;
 case 3:
 rank3 = "3";
 break;
 case 4:
 rank3 = "4";
 break;
 case 5:
 rank3 = "5";
 break;
 case 6:
 rank3 = "6";
 break;
 case 7:
 rank3 = "7";
 break;
 case 8:
 rank3 = "8";
 break;
 case 9:
 rank3 = "9";
 break;
 case 10:
 rank3 = "10";
 break;
 case 11:
 rank3 ="Jack";
 break;
 case 12:
 rank3 ="Queen"; 
 break;
 case 13:
 rank3 = "King"; 
 break;
}




//determine suit based on a random number generation
switch (Randomsuit4){
 case 1:
 suit4="Diamonds"; // prints Diamonds if you have a 1 in your hand
 break;
 case 2:
 suit4="Clubs";
 break;
 case 3:
 suit4="Hearts"; 
 break;
 case 4:
 suit4="Spades"; 
 break;
}



//determine rank based on a randomly generated number
switch (n4){
 case 1:
 rank4 ="Ace"; // prints Ace if you have a 1 in your hand
 break;
 case 2:
 rank4 = "2";
 break;
 case 3:
 rank4 = "3";
 break;
 case 4:
 rank4 = "4";
 break;
 case 5:
 rank4 = "5";
 break;
 case 6:
 rank4 = "6";
 break;
 case 7:
 rank4 = "7";
 break;
 case 8:
 rank4 = "8";
 break;
 case 9:
 rank4 = "9";
 break;
 case 10:
 rank4 = "10";
 break;
 case 11:
 rank4 ="Jack";
 break;
 case 12:
 rank4 ="Queen"; 
 break;
 case 13:
 rank4 = "King"; 
 break;
}
//determine suit based on a random generation
switch (Randomsuit5){
 case 1:
 suit5="Diamonds"; // prints Diamonds if you have a 1 in your hand
 break;
 case 2:
 suit5="Clubs";
 break;
 case 3:
 suit5="Hearts"; 
 break;
 case 4:
 suit5="Spades"; 
 break;
}
//determine rank based on a randomly generated number
switch (n5){
 case 1:
 rank5 ="Ace"; // prints out Ace if you have a 1 in your hand
 break;
 case 2:
 rank5 = "2";
 break;
 case 3:
 rank5 = "3";
 break;
 case 4:
 rank5 = "4";
 break;
 case 5:
 rank5 = "5";
 break;
 case 6:
 rank5 = "6";
 break;
 case 7:
 rank5 = "7";
 break;
 case 8:
 rank5 = "8";
 break;
 case 9:
 rank5 = "9";
 break;
 case 10:
 rank5 = "10";
 break;
 case 11:
 rank5 ="Jack";
 break;
 case 12:
 rank5 ="Queen"; 
 break;
 case 13:
 rank5 = "King"; 
 break;
}

//prints the generated random number from 5 different card decks
 System.out.println("Your random cards were: "); 
 System.out.println("the "+rank1+ " of " +suit1); 
 System.out.println("the "+rank2+ " of " +suit2); 
 System.out.println("the "+rank3+ " of " +suit3); 
 System.out.println("the "+rank4+ " of " +suit4); 
 System.out.println("the "+rank5+ " of " +suit5); 
 
}
}