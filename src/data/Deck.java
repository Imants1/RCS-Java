/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Ilzīte
 */
public class Deck {

    private ArrayList<Card> cards;

    private char[] suits = {'H', 'D', 'S', 'C'};
    
    private String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    Deck() {
        this.cards = new ArrayList<Card>();
        
        for(char suit : this.suits){
            for(String value : this.values){
                this.cards.add(new Card(suit, value));
            }
        }
        
    }
public void shuffle(){
    Collections.shuffle(this.cards);
    
}

public Card getCard(){//šī ir vieta, kur var uztaisīt sarakstu ar izman totajām kārtīm
    Card card = this.cards.get(0);
    this.cards.remove(0);
    
    return card;
}
}
