import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {


        ArrayList<Card> hand = new ArrayList<>();
      /*      for (int i =0; i < 5; i++){

            System.out.println("PLease enter The face value of your card( ex:1,5,6)");
            String face = keyboard.nextLine();
            System.out.println("Please enter suit (ex: hearts, spade)");
            String suit = keyboard.nextLine();
            Card card = new Card(face,suit);
            hand.add(card);
        }*/
    Card card = new Card("10","hearts");
        Card card1 = new Card("10","hearts");
        Card card2 = new Card("2","hearts");
        Card card3 = new Card("9","hearts");
        Card card4 = new Card("2","hearts");
        hand.add(card);
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        hand.add(card4);

         Game game = new Game();

       // System.out.println(hand.contains("10"));

      //System.out.println(game.flush(hand));
        //System.out.println(game.threeOfKind(hand));
      //  System.out.println(game.fourOfKind(hand));
       System.out.println(game.fullHouse(hand));
        //System.out.println(game.onePair(hand));
        System.out.println(game.twoPair(hand));






    }

}
