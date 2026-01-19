/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random() * 13) + 1);
            
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])            card.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            magicHand[i] = c;
        }

        // a hard-coded lucky card
        Card luckyCard = new Card();
        luckyCard.setValue(7); // Choose your lucky number (1-13)
        luckyCard.setSuit("Hearts"); // Choose your lucky suit
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
        Scanner input = new Scanner(System.in);
   
        System.out.println("Pick a card - any card!");
        System.out.print("Enter card value (1-13): ");
        int userValue = input.nextInt();
        System.out.print("Enter suit (Hearts, Diamonds, Clubs, Spades): ");
        String userSuit = input.next();

        // Search for the card in magicHand
        boolean found = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == userValue && 
                magicHand[i].getSuit().equalsIgnoreCase(userSuit)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
        }
    
}
