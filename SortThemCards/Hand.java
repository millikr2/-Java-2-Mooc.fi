
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        cards.stream().forEach(h -> System.out.println(h));
    }

    public void sort() {
        Collections.sort(cards);
    }
    
    public void sortBySuit() {
        //language barrier from finnish to english: should be called sortBySuitInValueOrder
        Collections.sort(cards, new BySuitInValueOrder());    
    }

    @Override
    public int compareTo(Hand otherHand) {
        //winning hands by card values only
        int handTotal = cards.stream().mapToInt(c -> c.getValue()).sum();
        int otherHandTotal = otherHand.cards.stream().mapToInt(c -> c.getValue()).sum();

        int winner = Integer.compare(handTotal, otherHandTotal );
        return winner;
    }

}
