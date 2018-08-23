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
public interface Participant {
    void giveCard(Card card, boolean isBlind);//piešķir dalībniekam kārti
    
    boolean needOtherCard();// pārbauda vai vajag vēl kārti
    
    int getTotalPoints();//saskaita cik šobrīd punkti rokā
    
    ArrayList<Card> getCards();
}
