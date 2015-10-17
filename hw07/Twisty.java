//Sam Forman
//CSE2
//
// hw07
// javac Twisty.java
// run the program
// java Twisty//


import java.util.Scanner;//import scanner class for user input
public class Twisty{
//defines the main method

    public static void main(String[] args){
    Scanner myScanner= new Scanner(System.in); //creates a new scanner object
    int length=0; //define and declares the length
       
            boolean Xinput=true; //conditions the loop
            while(Xinput){
            try{
                    System.out.print("Please Enter length:"); //Inputs the length
                    length = myScanner.nextInt();//scans in the input
                    Xinput = false;
                    }
                    catch(java.util.InputMismatchException ex) { //catch statement defines the case of exceptions
                    System.out.println("You're input is not valid."); //tells user that value is not valid
                    Xinput = true;
                    myScanner.nextLine();
                    }
                        if((length<0 || length>80) && !Xinput){ //tests whether the length is less than zero or greater than 80
                        Xinput=true; //if so have looping conditions
                        System.out.println("You're input is not valid.");
                        myScanner.nextLine();//erase input
                        }
                         }
                        int width=0; //defines and declares the width
                        Xinput=true; //conditions the loop
                        while(Xinput){
                        try{
                        System.out.print("Please Enter the width:"); //enter the width
                        width = myScanner.nextInt(); //scans in the input
                        Xinput=false;
                        }
                            catch(java.util.InputMismatchException ex) { //catch statement defines the case of exceptions
                            System.out.println("You're input is not valid."); //tells user that value is not valid
                            Xinput=true;
                            myScanner.nextLine();
                            }
                                    if((width<0 || width>length) && !Xinput){//tests whether the length is less than zero or greater than 80
                                    Xinput=true; //conditions the loop
                                    System.out.println("You're input is not valid, width must be less than length.");
                                    myScanner.nextLine(); //erases the input
                                    }
                                    }
                                        //begins the loop
                                        for(int i=0; i<width; i++){
                                        //i counts the row, based on width
                                        for(int j=0; j<length;j++){
                                        //j counts the column, based on length
                                                if((j%(2*width)==i)||(j%(2*width))==(2*width-(i+1))){
                                                System.out.print("#"); //prints pounds symbol in the helix
                                                }
                                                else if(j%(2*width)+1==(width-i) ){
                                                System.out.print("/"); //prints half of the slashes facing upwards
                                                }
                                                else if(j%(2*width)==i+(width)){
                                                System.out.print("\\"); //prints half of slashes facing downwards
                                                }
                                                else{
                                                System.out.print(" ");
                                                }
                                                 }
                                                    System.out.println(); //prints the next row
                                                  }
                                                    }
                                                      }