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

    @Test
    void flush() {
        ArrayList<Card> hand = new ArrayList<>();
        Game game = new Game();
        hand.add(card);
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        hand.add(card4);
assertEquals(true,game.flush(hand));
    }

    @Test
    void threeOfKind() {
        ArrayList<Card> hand = new ArrayList<>();
        Game game = new Game();
        hand.add(card);
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        hand.add(card4);
        assertEquals(false,game.threeOfKind(hand));
    }

    @Test
    void fourOfKind() {
        ArrayList<Card> hand = new ArrayList<>();
        Game game = new Game();
        hand.add(card);
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        hand.add(card4);
        assertEquals(true,game.fourOfKind(hand));
    }

    @Test
    void fullHouse() {
        ArrayList<Card> hand = new ArrayList<>();
        Game game = new Game();
        hand.add(card);
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        hand.add(card4);
        assertEquals(false,game.fullHouse(hand));
    }

    @Test
    void onePair() {  ArrayList<Card> hand = new ArrayList<>();
        Game game = new Game();
        hand.add(card);
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        hand.add(card4);
        assertEquals(false,game.onePair(hand));
    }
    @Test
    void twoPair() {  ArrayList<Card> hand = new ArrayList<>();
        Game game = new Game();
        hand.add(card);
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        hand.add(card4);
        assertEquals(true,game.onePair(hand));
    }

    @Test
    void search() {
        ArrayList<Card> hand = new ArrayList<>();
        Game game = new Game();
        hand.add(card);
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        hand.add(card4);
        assertEquals(2,game.search(hand,"j"));
    }
}