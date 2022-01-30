/**
 * Modifier:         Gurleen Kaur
 * Student ID Number:991649891
 */
package cardtrick;
import java.util.Random;
import java.util.Scanner;  //import Scanner
/** step 1: generate 7 random cards and store in array 
 * 52 deck size: 
 * 2 spades
 * 5 hearts
 * 1 clubs
 * ... 7 cards
 */
public class Cardtrick {

    
    public static void main(String[] args) 
    {
        
        
        Scanner input = new Scanner(System.in);
        
      Card[] magicHand = new Card[7];
        
                 //random generation for number/use method
      
       //Array of object 
      for (int i=0 ; i<magicHand.length ; i++)
      {
        // step 1: generate 7 random cards and store in array
          Card c= new Card();
          c.setNumbers((int)(Math.random()*14));       //random generation for number/use method
          String [] suits = {"Diamonds","Spades","Clubs","Hearts"};
         
         Random random = new Random();
         int n = random.nextInt(3);
         // stores the card object  in array
         magicHand[i] = c;
          
          System.out.println(c.getNumbers() + " " + suits[n]);
    }    
      
       //step 2: take input guess the card 2 spades find in array - print your card is found
      System.out.print(" Guess any number from 1 to 13! ");
      int a = input.nextInt();
      
      System.out.print("Guess a suit: Hearts, Diamonds, Clubs, Spades!");
      String b = input.next();
      
            System.out.println("Congratulations! Your card is generated!");
       
        Card luckyCard = new Card();   // create card object for my luckycard
        int num = 7;
        String suit = "Diamonds";
        System.out.println("My lucky card suit is: " + suit + " " + "and number is: " + num);
}
    
     
    // step 3 do change in remote repository. hard coded card details card number =2,hearts to find in array
    }
    //--Gurleen Kaur,991649891
