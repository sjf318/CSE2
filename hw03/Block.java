//Sam Forman
// HW 3 Block
//hw03
//
// first compile the program
//     javac Block.java
// run the program
//     java Block.java//

import java.util.Scanner; //introduces scanner to the program

public class Block{
                // main method required for each program
public static void main(String[] args) {
    
    Scanner myScanner = new Scanner ( System.in ); //creates personal scanner
    
    System.out.println("Enter the length of the block"); //prompts user to enter length value
    double length = myScanner.nextDouble(); //tells scanner to make previous input value as length
    
    System.out.println("Enter the width of the block"); //prompts user to enter width value
    double width = myScanner.nextDouble(); //tells scanner to make previous input value as width
    
    System.out.println("Enter the height of the block"); //prompts user to enter height value
    double height = myScanner.nextDouble(); //tells scanner to make previous input value as height
    
    double volume = (height*width*length); //calculates the volume of the block - length*width*height
    
    double surfaceArea = (2*((length*width)+(length*height)+(width*height))); //calculates surface area of the block - 2*(length*width + length*height + width*height) )
    
    System.out.println("The volume of the block of dimensions " +length+" x "+width+" x "+height+" is "+volume+" .");
}
    
    
    
    
    
}