/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author Ilzīte
 */
public class Dealer implements Participant{
    
    private Hand hand;
    
    Dealer(){
        this.hand = new Hand();
    }

       public void giveCard(Card card, boolean isBlind) {
        card.isBlind = isBlind;
           this.hand.addCard(card);
  }

   
    @Override
    public boolean needOtherCard() {
       return getTotalPoints() < 17;
    }

    
    @Override
    public int getTotalPoints() {
        
        return this.hand.countPoints();
    }

    @Override
    public ArrayList<Card> getCards() {
       return this.hand.getCards();}
    
}
