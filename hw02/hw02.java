//Sam Forman
// HW 2
//hw02
//
// first compile the program
//     javac hw02.java
// run the program
//     java hw02.java//

public class hw02{
    
    //add a method
    public static void main(String[] args) {
    
    int nSocks=3; //number of socks
    double sockCost$=2.58; //cost per sock in dollars
    
    int nGlasses=6; //number of drinking glasses
    double glassCost$=2.29; //cost per glass in dollars
    
    int nEnvelopes=1; //number of envelopes 
    double envelopeCost$=3.25; //cost of envelopes
   
    double taxPercent=1.06; //tax percent on cost
    
    double totalSockCost$=(nSocks*sockCost$); //total cost of socks
    double totalGlassCost$=(nGlasses*glassCost$); //total cost of glasses
    double totalEnvelopeCost$=(nEnvelopes*envelopeCost$); //total cost of envelopes 
    
    double totalbeforetax=((totalEnvelopeCost$+totalGlassCost$+totalSockCost$)*100);//total cost before tax
    totalbeforetax=(int)totalbeforetax;
    totalbeforetax=totalbeforetax/100;
    
    double totalprice=((totalbeforetax*taxPercent)*100); //total cost after tax
    totalprice=(int)totalprice;
    totalprice=totalprice/100;
   
    double totaltax= ((totalprice-totalbeforetax)*100); 
    totaltax=(int)totaltax;
    totaltax=totaltax/100;
    
    System.out.println("number of socks = "+nSocks+"  cost = $"+totalSockCost$+""); //displays number of socks + total price for items
    System.out.println("number of glasses = "+nGlasses+"  cost = $"+totalGlassCost$+""); // number of glasses +total price for items
    System.out.println("number of envelopes = "+nEnvelopes+"  cost = $"+totalEnvelopeCost$+""); //number of envelopes +total envelope cost
    System.out.println("                                                           ");
    System.out.println("Subtotal = $"+totalbeforetax+""); //subtotal before tax
    System.out.println("Tax = $"+totaltax+"   Total = $"+totalprice+""); //tax and total price
    
    }
    }