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
public class Hand {
    private ArrayList<Card> cards;

    public ArrayList<Card> getCards() {//Source --Insert Code -- palīdz uzģenerēt kodu
        return cards;
    }
    
    Hand(){
        cards = new ArrayList<Card>();
        
    }
    
    public void addCard(Card card){
        this.cards.add(card);
    }
    
  public int countPoints(){
           
      int points = 0;
      int aceCount = 0;
      
      for (Card card : this.cards){
          points += card.getPoints();
          if (card.getValue().equals("A")){
              aceCount++;
          }
      }
      while(points > 21 && aceCount >0){
      points -= 10;
      aceCount--;
  }
      return points;
  }  
    
}
