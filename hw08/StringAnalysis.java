//Sam Forman
//CSE2
//
// hw08
// javac StringAnalysis.java
// run the program
// java StringAnalysis

import java.util.Scanner; //Scanner class

public class StringAnalysis{ //defines class

    public static int analysis(String a) { //defines the method used for the string
    int count = 0; //define variable
    for (int i=0; i < a.length(); i++){ //allows loop to analyze each character of the user input
    if (Character.isLetter(a.charAt(i))){
    count++; //increment count
            }
        }
    return count; 
    }
    
    public static int analysis(String a, int number) { 
    int count = 0; //defines the variable
    for (int i=0; i < number; i++){ //Analyzes a specific number of characters of the String input from the user
    if (Character.isLetter(a.charAt(i))){
    count++; //increment count
         }
        }
    return count;
    }
       
    public static void main(String[] args) { 
    Scanner myScanner = new Scanner(System.in); //declares the use of scanner
    boolean check = true;  //defines the variable
    System.out.println("If you want to evaluate all of the characters type all, if you want to evalute only some of the characters type some: "); //print statement asking for input from user
    String input = myScanner.next(); 
    while (check){ //while loops checks whether the input is either  'all' or 'some'
    if (input.equals("all") || input.equals("some")){ 
    check = false; 
      }
    else {
    
    System.out.println("Invalid input. Please enter 'some' or 'all':"); //tells the user that their input is invalid
    input = myScanner.next();
    check = true;
      }
     }
        
    if (input.equals("all")){ 
    System.out.print("Please enter a string: "); //prints statement asking for the user to input a string
    String X = myScanner.next(); //X defines the user input
    System.out.println("The number of letters is " + analysis(X)); //prints the statement that tells the user the number of letters in their entered string

    }
    else {
           
    System.out.print("Please enter a string: "); //prints the statement asking for a string from the user
    String X = myScanner.next(); //X is defined as the input from the user
    System.out.print("Please enter a number: "); //prints the statement asking for a number from the user
    int number = myScanner.nextInt();
    System.out.println("The number of letters is " + analysis(X, number)); //prints the statement that tells user the number of letters in their inputed string varying on how many characters they wanted evaluated 

            }    
          }
        }