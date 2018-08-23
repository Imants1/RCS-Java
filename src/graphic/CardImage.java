/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic;

import data.Card;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Ilzīte
 */
public class CardImage extends JLabel{
    public CardImage(Card card){
        String cardFileName;
        
        if(card.isBlind){
            cardFileName = "00";
        }
        else{
            cardFileName = card.getFullName();
            
            //String cardFileName = card.isBlind ? "00" : card.getFullName();
            //īsais variants if ciklam
        }
        cardFileName += ".png";
        
        this.setIcon(new ImageIcon(getClass().getResource("/images/" + cardFileName)));
    }
}
