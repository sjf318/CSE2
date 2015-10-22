//Sam Forman
//CSE2
//
// hw08
// javac Area.java
// run the program
// java Area

import java.util.Scanner; //Scanner class

public class Area{ //defining a class

    public static void PrintCircleArea(double radius) { //defining method used to print the area of a circle
    System.out.println("The area of the circle = " + Math.PI*radius*radius); //Printing out the area of a circle
    }
        public static void PrintRectangleArea(double length, double width) {  //defining method used to print the area of a rectangle
        System.out.println("The area of the rectangle = " + length*width); //Prints out the area of a rectangle
        }
            public static void PrintTriangleArea(double height, double lengthBase) {  //defining method used to print the area of a triangle
            System.out.println("The area of the triangle = " + ((height*lengthBase)/2)); //prints out the area of a triangle
            }
                public static void main(String[] args) { // main method required for every Java program
                Scanner myScanner = new Scanner(System.in); //declaring use of scanner
                boolean check = true; //define check as true
        
                System.out.print("Enter the name of your desired shape: "); //print out message asking for input from user
                String area = myScanner.next(); //defining area as the user's input
                while (check){ //while loop to check the validity of input
                if (area.equals("circle") || area.equals("rectangle") || area.equals("triangle")){ //checks whether the user inputed a correct string
                check = false;
                }
                
                else {
                System.out.println("Invalid input. Please try again: "); //tell user that input is invalid
                area = myScanner.next();
                check = true;
                }
                }
                
                
                double radius = 0; //defines the variables
                double length = 0;
                double width = 0;
                double height = 0;
                double lengthBase = 0;
        
                if (area.equals("circle")){ 
                System.out.print("Input the radius of the circle: "); //prints statement asking the user to input a radius
                radius = myScanner.nextDouble(); 
                PrintCircleArea(radius); //prints the area of the circle as definined in the PrintTriangleArea method
                    
                }
                else if (area.equals("rectangle")){
                System.out.print("Input the length of the rectangle: "); //print statement asking for input for lengthgth from the user
                length = myScanner.nextDouble();
                System.out.print("Input the width of the rectangle: "); //print statement asking for input for width from the user
                width = myScanner.nextDouble();
                PrintRectangleArea(length, width); //print the area of the rectangle 

                 }
                else {
                System.out.print("Input the height of the triangle: "); //print statement asking for user to input height
                System.out.print("Input the length of the base of the triangle: "); //print statement for user to input base length of triangle
                lengthBase = myScanner.nextDouble();
                PrintTriangleArea(height,lengthBase); 

                    }
                     }
                      }
