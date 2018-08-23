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
public class Player implements Participant{
    private Hand hand;
    
    Player(){
        this.hand = new Hand();
    }
    
    
    
    @Override
    public void giveCard(Card card, boolean isBlind) {
        card.isBlind = isBlind;
    this.hand.addCard(card);
    System.out.println("Tu saņēmi " + card.getFullName());
    System.out.println("Tev ir " + getTotalPoints() + " punkti.");
    }

    
    @Override
    public boolean needOtherCard() {
    if (getTotalPoints()>21){
        return false;
    }
        boolean result = Game.askQuestion("Vai nepieciešama kārts?");
    return result;
    }

    
    @Override
    public int getTotalPoints() {
    return this.hand.countPoints();
    }

    @Override
    public ArrayList<Card> getCards() {
        return this.hand.getCards();}
    
}
