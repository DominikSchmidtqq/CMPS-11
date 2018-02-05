/**
 * Created by domin on 2/5/2018.
 */
public class Player extends Bingo{
    String name;
    Card[] cards;
    Player(String name, Card[] cards){
        this.name = name;
        this.cards = cards;
    }
    Player(){
        this("", cards);
    }
    public String getName(){
        return this.name;
    }
    public Card[] getCards(){
        return this.cards;
    }
    public boolean isWinner(){

    }
    public void markNumber(int number){
        for (int i = 0; i < players.length
    }
}
