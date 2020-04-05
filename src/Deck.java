import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards;

    public Deck() {

    }

    private void initDeck(){
        int NUM_OF_CARDS = 52;
        cards = new ArrayList<>(NUM_OF_CARDS);

        for( Suit suit : Suit.values() ){
            for( Rank rank : Rank.values() ){
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card pick(){
        if( cards.isEmpty() )
            throw new RuntimeException("Deck is empty!");
        return cards.remove(cards.size()-1);
    }
}
