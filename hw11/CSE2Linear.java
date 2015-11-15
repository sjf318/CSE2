//Sam Forman
//CSE2
//
// hw11
// javac CSE2Linear.java
// run the program
// java CSE2Linear
// This program prompts the user to input 15 class grades and then searches for a grade


import java.util.Scanner; //imports scanner method


public class CSE2Linear {
    //creates the main method
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        int[] grades = new int [15]; //creates the array for grades to be entered into
        System.out.print("Enter 15 ints for final grades in CSE2: "); //asks the user to enter 15 grades
        grades[0]=locategrade(scan);
       for (int i=1; i<15 ; i++) {
             grades[i] = locategrade(scan); 
             while (grades[i]<grades[i-1]){
                 System.out.println("Error. Please enter a new number larger than the previous number entered.");
                 grades[i] = locategrade(scan);
             }
        }
        System.out.print("The following grades are:  ");
        printArray(grades); //method printArray will print the grades
        int search; 
        System.out.print("Please enter a grade to search for: ");
        search = scan.nextInt();
            for (int j=0; j<15; j++) {
            if (search==grades[j] ){ //if the value is found within the array
            System.out.print(search + " was found with" + (j+1) + " iterations.\n");
            break;
            }
            else if(search<grades[j]){ //if searches has gone past where grade is located
            System.out.print(search + " was not found with " + (j+1) + " iterations.\n");
            break;
            }
            else if (j==14) { //at this point the searched grade could not be found
            System.out.print(search + " was not found with " + (j+1) + " iterations.\n");
            }
             }
            
            //shuffle the array of grades
            shuffle(grades); //uses shuffle method
            System.out.println("Scrambled: ");
            printArray(grades);
            System.out.print("Please enter a new grade to search for: ");
            search = scan.nextInt();
            
            for (int j=0; j<15; j++) {
            if (search==grades[j] ){ //if the value is found within the array
            System.out.print(search + " was found with " + (j+1) + " iterations.\n");
            break;
            }
            else if (j==14) { //at this point the searched grade could not be found
            System.out.print(search + " was not found with " + (j+1) + " iterations.\n");
            }
           }
          } //end of main method
    
        //locategrade method forces user input to be between 0 and 100 
        public static int locategrade (Scanner in){  
        //checks whether the input is an int
           int grade = -1;
                do{
                while (!in.hasNextInt()) { //if user input is not an int
                String input = in.next(); //checks the next input
                System.out.printf("Error: Please type in an integer.", input); //Prints Error Message
                }
                    int input = in.nextInt(); //checks next inputed integer
                    while(input<0 || input>100) { //if the user input is less than zero or above 100
                    System.out.printf("Error: Please only enter numbers between 0 and 100 \n", input); 
                    break;
                    }
                    
                    grade = input; //For the first correct input
                    } while (grade<0 || grade>100); //this will continue to run while the inputs are integers between 0 and 100
                    return grade; //returns the grade
                    }

        //the method printArray prints out the array
            public static void printArray(int [] grades){
            for (int j=0; j<grades.length; j++){
            System.out.print(grades[j]+" "); //prints out each grade and adds a space after the number
            }
            System.out.println(""); //adds another space
            return; //returns back to the main program
            }//end of the printArray method


            //start of the shuffling method
            public static int [] shuffle(int[]grades){
            for (int k=0; k<25; k++){
            int location = (int)(Math.random()*15); //chooses which card to pick from the inputed integers
            int correctlocation = grades[0]; //creates integer correctlocation
            grades[0] = grades[location]; 
            grades[location] = correctlocation;
            }
            return grades; //returns the grade
            } //end of the shufflng method
                

        
        
        } 