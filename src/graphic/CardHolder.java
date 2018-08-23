/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic;

import javax.swing.JPanel;

/**
 *
 * @author Ilzīte
 */
public class CardHolder extends JPanel{
    public CardHolder(){
        
    }
    public void addCard(CardImage card){
        this.add(card);
    }
    
    public void Clear(){
        this.removeAll();
    }
    
}
