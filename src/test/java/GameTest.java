import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    ArrayList<Card> hand = new ArrayList<>();
    Card card = new Card("a","hearts");
    Card card1 = new Card("a","hearts");
    Card card2 = new Card("k","hearts");
    Card card3 = new Card("a","hearts");
    Card card4 = new Card("j","hearts");

    @Test/**
     this test tests the flush method from the game class
     a flush requires all cards in the hand to have the same suit

     the method parameters are an arraylist of cards
     the method contains a variable declared equal to the suit value of the first card in
     the array provided to the method,and it uses a for each loop to check every card in
     the array to make sure the suit is the same as the declared variable if not it returns
     false else it returns true

     expected output for cards (a of hearts,a of hearts,k of hearts,a of hearts,j of hearts) True
 */
    void flush() {

        Game game = new Game();
        hand.add(card);
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        hand.add(card4);
assertEquals(true,game.flush(hand));
    }

    @Test
    /**
     this test tests the threeOfKind method from the game class
     a three of a kind hand requires three cards in the hand to have the same face value

     the method parameters are an arraylist of cards
    This method uses a for loop to check the face value of each of the cards and see if there are three occurrences
     using another method called search. if there are three occurrence of the face value it returns true else
     it returns false
     expected output for cards (a of hearts,a of hearts,k of hearts,a of hearts,j of hearts) True
     */
    void threeOfKind() {

        Game game = new Game();
        hand.add(card);
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        hand.add(card4);
        assertEquals(false,game.threeOfKind(hand));
    }

    @Test
    /**
     this test tests the fourOfKind method from the game class
     a three of a kind hand requires four cards in the hand to have the same face value

     the method parameters are an arraylist of cards
     This method uses a for loop to check the face value of each of the cards and see if there are four occurrences
     using another method called search. if there are four occurrence of the face value it returns true else
     it returns false
     expected output for cards (a of hearts,a of hearts,k of hearts,a of hearts,j of hearts) false
     */
    void fourOfKind() {

        Game game = new Game();
        hand.add(card);
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        hand.add(card4);
        assertEquals(false,game.fourOfKind(hand));
    }

    @Test   /**
     this test tests the fullHouse method from the game class
     a full house hand requires a three of a kind( three cards with the same face value) and
     one pair (two cards with the same value) two different pairs two separate face values one repeated three times the
     other repeated twice in the hand


     the method parameters are an arraylist of cards
     This method returns true if the both the three of a kind and two pairs method return true
     else it returns false
     expected output for cards (a of hearts,a of hearts,k of hearts,a of hearts,j of hearts) False
     */

    void fullHouse() {

        Game game = new Game();
        hand.add(card);
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        hand.add(card4);
        assertEquals(false,game.fullHouse(hand));
    }

    @Test   /**
     this test tests the onePair method from the game class
     a one pair hand requires two of the cards in the hand to have the same face value

     the method parameters are an arraylist of cards
     This method uses a for loop to check the face value of each of the cards and see if there are two occurrences
     using another method called search. if there are two occurrence of the face value it returns true else
     it returns false
     expected output for cards (a of hearts,a of hearts,k of hearts,a of hearts,j of hearts) True
     */
    void onePair() {
        Game game = new Game();
        hand.add(card);
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        hand.add(card4);
        assertEquals(true,game.onePair(hand));
    }
    @Test
    /**
     this test tests the twoPair method from the game class
     a Two pair hand requires two one pair hands ( two cards with the same face cards) two different pairs
     two separate face values
     both repeated twice in the hand

     the method parameters are an arraylist of cards
     this method use an inbeded for loop the outer loop is reference to the card the innner loop runs if there are more than four cards in the array
     if there are the inner loop will delete the matching cards

     then the array is passed to another inbeded for loop same as the last except the inner loop only runs if the array contains more than
     two cards it returns true if the array only contains one card object else it returns true


     expected output for cards (a of hearts,a of hearts,k of hearts,a of hearts,j of hearts) false
     */
    void twoPair() {
        Game game = new Game();
        hand.add(card);
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        hand.add(card4);
        assertEquals(false,game.twoPair(hand));
    }

    @Test
    /**   this test tests the search method from the game class


     the method parameters are an arraylist of cards and a string
     this method  first makes a variable called counter that will be used in the for loop
     the for loop goes through each card object in the array and if it is equal to the value of i is equal to the string
     you entered as the parameter then the counter wil increment by 1 and the method will return the value of counter


     expected output for cards (a of hearts,a of hearts,k of hearts,a of hearts,j of hearts) 3
     */

    void search() {

        Game game = new Game();
        hand.add(card);
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        hand.add(card4);
        assertEquals(3,game.search(hand,"a"));
    }
}