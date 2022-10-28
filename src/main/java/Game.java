import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Game {
    public Game() {
    }

    public boolean flush(ArrayList<Card> array) {

        String suit = array.get(0).getSuit();
        for (Card card : array
        ) {
            if (!card.getSuit().equals(suit)) {
                return false;
            }
        }
        return true;
    }

    public boolean threeOfKind(ArrayList<Card> array) {


        for (int i = 0; i < array.size(); i++) {
            if (search(array, array.get(i).getFace()) == 3
            ) {
                return true;
            }
        }
      /*  if (search(array, array.get(0).getFace()) == 3) {
            return true;
        } else if (search(array, array.get(1).getFace()) == 3) {
            return true;
        } else if (search(array, array.get(2).getFace()) == 3) {
            return true;
        } else if (search(array, array.get(3).getFace()) == 3) {
            return true;
        } else return search(array, array.get(4).getFace()) == 3;

*/ return false;
    }

    public boolean fourOfKind(ArrayList<Card> array) {
        for (int i = 0; i < array.size(); i++) {
            if (search(array, array.get(i).getFace()) == 4
            ) {
                return true;
            }
        }

       /* else if (search(array, array.get(1).getFace()) == 4) {
            return true;
        } else if (search(array, array.get(2).getFace()) == 4) {
            return true;
        } else if (search(array, array.get(3).getFace()) == 4) {
            return true;
        } else return search(array, array.get(4).getFace()) == 4;*/

        return false;
    }

    public boolean fullHouse(ArrayList<Card> array) {
        return threeOfKind(array) && twoPair(array);

    }

    public boolean twoPair(ArrayList<Card> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.size() > 4) {
                for (int j = i + 1; j < array.size();  j++) {
                    if (array.get(j).getFace().equals(array.get(i).getFace())) {
                        array.remove(j);
                        array.remove(i);
                        break;
                    }
                }
            }


        }



        for (int i = 0; i < array.size(); i++) {
            if (array.size() > 2) {
                for (int j = i + 1; j < array.size(); j++) {
                    if (array.get(j).getFace().equals(array.get(i).getFace())) {
                        array.remove(j);
                        array.remove(i);
                        break;
                    }


                }

            }
        }



        return array.size() == 1;
    }



    public boolean onePair(ArrayList<Card> array) {
        for (int i = 0; i < array.size(); i++) {
            if (search(array, array.get(i).getFace()) == 4
            ) {
                return true;
            }
        }
        /*if (search(array, array.get(0).getFace()) == 2) {
            return true;
        } else if (search(array, array.get(1).getFace()) == 2) {
            return true;
        } else if (search(array, array.get(2).getFace()) == 2) {
            return true;
        } else if (search(array, array.get(3).getFace()) == 2) {
            return true;
        } else return search(array, array.get(4).getFace()) == 2;*/
        return false;
    }


    static int search(ArrayList<Card> arr, String s) {
        int counter = 0;
        for (int j = 0; j < arr.size(); j++)

            if (s.equals(arr.get(j).getFace()))
                counter++;

        return counter;


    }


}