
package cardtrick;

public class Card 
{
    private int numbers; //encapsulate it getters and setters
    private String suit;
    
    public static final String[] SUITS = {"diamonds","spades","clubs","hearts"};
    
    /**
     * @return the numbers
     */
    public int getNumbers() {
        return numbers;
    }

    //numbers the numbers to set
    
    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    //return the suit
     
    public String getSuit() {
        return suit;
    }

  //suit the suit to set
   
    public void setSuit(String Hearts, String Diamonds, String Clubs, String Spades) {
        this.suit = suit;
    }
    
    public String toString()
    {
    return this.suit;
    }

    void setSuit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
