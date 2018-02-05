/**
 * Created by domin on 2/5/2018.
 */
public class Player {
    String name;
    Card[] cards;
    public Player(String name, Card[] cards){
        this.name = name;
        this.cards = cards;
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

    }
}
