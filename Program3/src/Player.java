/**
 * Created by domin on 2/5/2018.
 */
public class Player {
    String name;
    Card[] cards;
    Player(String name, Card[] cards){
        this.name = name;
        this.cards = cards;
    }
    Player(){
        this("", new Card[0]);
    }
    public String getName(){
        if (this.isWinner() == true)
            return this.name;
    }
    public Card[] getCards(){
        return this.cards;
    }
    public boolean isWinner() {
        for (int j = 0; j < this.getCards().length; j++) {
            for (int k = 0; k < 5; k++) {
                for (int l = 0; l < 5; l++) {
                    if (this.cards[j].marked[k][l] == false)
                        break;
                    else
                        return true;

                }
            }
            for (int k = 0; k < 5; k++) {
                for (int l = 0; l < 5; l++) {
                    if (this.cards[j].marked[l][k] == false)
                        break;
                    else
                        return true;
                }
            }
        }
        return false;
    }
    public void markNumber(int number){
        for (int i = 0; i < this.cards.length; i++){
            cards[i].markNumber(number);
        }
    }
}
