/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ilzīte
 */
public class Game {
    private static Scanner input = new Scanner(System.in);
    
    private Participant player;
    private Participant dealer;
    private Deck deck;
    
    public boolean startNewGame(){
        boolean start = askQuestion("Vai uzsākt jaunu spēli?");
        if (start){
        startNewGameUI();
        
        while(this.player.needOtherCard()){
            givePlayerCard();
        }
        
        dealerTurn();
        
        countTotalPoints();
        }
    return start;
    
          
    }
    public void dealerTurn(){
        for(Card card : this.getDealerCards()){
            card.isBlind = false;
        }
         while(this.dealer.needOtherCard()){
            this.dealer.giveCard(this.deck.getCard(), false);
        }
    }
    
    
    public void givePlayerCard(){
        this.player.giveCard(this.deck.getCard(), false);
    }
    
    public void startNewGameUI(){
        this.player = new Player();
        this.dealer = new Dealer();
        this.deck = new Deck();
        this.deck.shuffle();
        
        this.player.giveCard(this.deck.getCard(), false);
        this.player.giveCard(this.deck.getCard(), false);
        this.dealer.giveCard(this.deck.getCard(), true);
        this.dealer.giveCard(this.deck.getCard(), true);
    }
    public int getPlayerPoints(){
        return this.player.getTotalPoints();
    }
    
    public int getDealerPoints(){
        return this.dealer.getTotalPoints();
    }
    
    
    private void countTotalPoints(){
        int playerPoints = getPlayerPoints();
        int dealerPoints = getDealerPoints();
        
        System.out.println("Spēlētāja punkti: " + playerPoints);
        System.out.println("Dīlera punkti: " + dealerPoints);
        
        
            System.out.println(getResult());
       
    }
    
    public String getResult(){
        
        int playerPoints = getPlayerPoints();
        int dealerPoints = getDealerPoints();
        if(playerPoints > 21){
            return "Tu zaudēji!";
        }
        else if(dealerPoints > 21){
            return "Tu uzvarēji!";
        }
        else if(playerPoints > dealerPoints){
            return "Tu uzvarēji!";
        }
        else if(playerPoints == dealerPoints){
            return "Nav uzvarētāja!";
        }
        else{
            return "Tu zaudēji!";
            
    }
    }
    
    public ArrayList<Card> getPlayerCards(){
        return this.player.getCards();
    }
    
    public ArrayList<Card> getDealerCards(){
        return this.dealer.getCards();
    }
    
    public static boolean askQuestion(String question){
        System.out.print(question);
        char answer = input.next().charAt(0);
       
        if(answer == 'y' || answer == 'Y'){
            return true;
                    }
        else{
            return false;
        }
    }
    
}
