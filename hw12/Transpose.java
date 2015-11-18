//Sam Forman
//CSE2
//
// hw12
// javac Transpose.java
// run the program
// java Transpose
// This program transposes an implemented matrix on other random matrices

import java.util.Scanner;

    public class Transpose{
        public static int [][] randomMatrix(int width, int height){ 
         int[][]matrix=new int[width][height]; 
         for(int i=0;i<width;i++){ 
         for(int j=0;j<height;j++){
                matrix[i][j]=-10+(int)(Math.random()*((20)+1)); //the nested for loop assigns member arrays with a random number between the values of  -10 and 10
        }
        }
        return matrix; //returns array
        }
    
    public static void printMatrix(int[][] matrix, int width,int height){
    if(width==height){ //If matrix is a square, it is invalid and user inputs must be changed to create a rectangular matrix
        System.out.println("Input must be create a rectangular matrix");
        return;
        }
        else{
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
            System.out.print(matrix[i][j]+" "); //Prints out the values that were previously declared
            }
            System.out.println();
         }
            }    
               }
    
    public static int[][] transposeMatrix(int[][] matrix, int width, int height){
        int[][]matrix1 = new int [width][height]; //New array
        for(int i=0; i<height;i++){
            for(int j=0; j<width; j++){ 
                matrix1[j][i]=matrix[i][j]; //Same as the random array except the height and width are switched
            }
        }
        return matrix1;
    }
    
        public static void main(String[] args) {
            Scanner scan = new Scanner ( System.in ); 
            boolean goodinput= false; //If input is invalid no matrix will be printed
            int height =0;
            int width =0;

    
        while(goodinput!=true){ //Loop only works if goodinput = true.. (if value is an int and creates a rectangle)
            System.out.println("Please enter the height:");
        
            if(scan.hasNextInt()){ //checks the user input for ints
            height=scan.nextInt();
            if(height>0){ //Matrix heigh must be greater than 0
                
                goodinput=true;
                
            }
            else{
                goodinput=false;
            }
            }
            else{ //if input is not an int
            goodinput=false;
            System.out.println("Please only enter ints, reenter your values");
            return;
            }
        
        }
        goodinput=false; 
            while(goodinput!=true){ 
            System.out.println("Please enter the width:");
        
         if(scan.hasNextInt()){
            width=scan.nextInt();
            if(width>0){
                
                goodinput=true;
            }
            else{
            goodinput=false;
            System.out.println("Only enter numbers greater than zero, please reenter your values");
            return;
                
            }
            }
        else{
              goodinput=false;
              System.out.println("Please only enter ints, reenter your values");
              return;
                 }
                 }
         System.out.println("Random Matrix:");
            int[][] matrix=randomMatrix(height,width); //declares the array as the return array
            printMatrix(matrix,width,height); //prints the array
    
         System.out.println();
            System.out.println("Transposed Matrix:");
            int[][] matrix1=transposeMatrix(matrix,width,height); //declares the new transposed matrix as the return array
            printMatrix(matrix1, width,height);

        }
            }