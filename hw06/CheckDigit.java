//Sam Forman
//CSE2
//
// hw06 Part 2
// javac CheckDigit.java
// run the program
// java CheckDigit//



import java.util.Scanner; //imports scanner 


public class CheckDigit{
    //main method

public static void main(String[] args){
        Scanner myScanner=new Scanner(System.in); //Introduces Scanner to system
        
int length=0; //find length of isbn string
boolean input=true; // assume that the input is incorrect 
String isbn="0"; //define isbn string
while(input){ //receives user input and checks it 
System.out.print("Enter an ISBN Number: "); //prompts user to type ISBN Number
isbn= myScanner.nextLine(); //accept user input
length=isbn.length(); //find length of string
if(length !=10){
System.out.println("Not a Valid ISBN");
continue; //repeats loop
}
input=false; //at this point input is a correct ISBN
for(int i=0;i<=8;i++){ 
//checks each character to see if it is a number, except check digit
char digit=isbn.charAt(i);
if(digit=='1'||digit=='2'||digit=='3'||digit=='4'||digit=='5'||digit=='6'||digit=='7'||digit=='8'||digit=='9'||digit=='0'){
//tests to see if character is a digit
 }
else{
input=true;
System.out.println("Not a Valid ISBN");
break;
}
}
char digit=isbn.charAt(9);//checks last digit value, including value X
if(digit=='1'||digit=='2'||digit=='3'||digit=='4'||digit=='5'||digit=='6'||digit=='7'||digit=='8'||digit=='9'||digit=='0'||digit=='X'){
//tests loop to see input
}
else{
input=true; //continues the loop
System.out.println("Not a Valid ISBN"); 
}
}
//Sums the first 9 numbers 
int sum=0; //defines summing value
char digit; //defines digit value
int multiplier; //defines multiplier
for (int j=0;j<=8;j++){
digit=isbn.charAt(j); //gets the character from string
multiplier=10-j;
sum=sum+((digit-'0')*multiplier); //adds the sum and subtract digit from 0 to equal raw value
} 
char checkdigitchar=isbn.charAt(9);//define check digit
//determine if it is an ISBN, and if not recommends program to check value
if(checkdigitchar=='X'){
if(sum%11==10){
//determines whether it is a correct ISBN number
System.out.println("This is a Valid ISBN");
}
else{
System.out.println("Not a valid check number");
for(int k=0;k<=10;k++){ 
if(sum%11==k){
if(k==10){ //prints x if value is ten
System.out.println("A correct check value is: X");
break;
}
else{
System.out.println("A correct check value is: "+k);
break;
}
}
}
}
}
if(checkdigitchar =='X'){
//determines whether it is a correct ISBN number
}
else if((sum%11==(checkdigitchar-'0'))){
System.out.println("This is a Valid ISBN");
}
else{
System.out.println("Not a valid check number");
for(int k=0;k<=10;k++){ 
if(sum%11==k){
if(k==10){
System.out.println("A correct check value is: X");
break;
        }
else{
System.out.println("A correct check value is: "+k);
         break;
}
}
}
}
}
}
