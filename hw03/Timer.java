//Sam Forman
// HW 3 Timer
//hw03
//
// first compile the program
//     javac Timer.java
// run the program
//     java Timer.java//

import java.util.Scanner; //introduces scanner to the program

public class Timer{
                // main method required for each program
        public static void main(String[] args)  {
            
Scanner myScanner = new Scanner (System.in); //creates personal scanner

System.out.println("Enter the current time in military HHMM form"); //prompts user to enter current time
int currentTime = myScanner.nextInt(); //tells program to input value as current time

System.out.println("Enter the time that you will be eating dinner"); //prompts user to dinner time 
int dinnerTime = myScanner.nextInt(); //tells program to input value as dinner time

double difference = dinnerTime - currentTime; //takes difference of TimerTime and currentTime

int hours =(int)difference; //converts difference of two times into an integer in order to convert to decimals
hours = (hours/100); // since hours are now an single decimal integer, by dividing it by 100 it will result in the number of hours
double mins = difference % 100; // minutes are calculated by dividing the differnce by 100
System.out.println("You have " +hours+ " hours and " +mins + " minutes until dinner"); //displays the timer's result



        }
            }