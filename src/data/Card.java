/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Ilzīte
 */
public class Card {
    private String value;//vērtība KQJA10987654321
    
    private char suit;//masts CHSD
    
    public boolean isBlind;
    
    Card(char suit, String value){//konstruktors kārtij
        this.suit = suit;
        this.value = value;
    }
    public String getFullName(){//atgriež pilno nosaukumu = masts+vērtība
        return suit + value;
    }
    
    public String getValue(){
        return value;
    }
    
    public int getPoints(){//atgriež kārts vērtību punktos
        switch(value){
            case "J":
            case "Q":
            case "K":
                return 10;//izmantojot return nav vajadzīgs break
            case "A":
                return 11;
            default:
                return Integer.valueOf(value);
        }
    }
    
}
