package Bingo;

/**
 * Created by domin on 2/12/2018.
 */
public class Player {
    /**
     *
     * Created by domin on 2/5/2018.
     */
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    int e = 0;
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
        return this.name;
    }
    public Card[] getCards(){

        return this.cards;
    }

    public boolean isWinner(){
        for (int j = 0; j < this.getCards().length; j++) {
            for (int k = 0; k < 5; k++) {
                for (int l = 0; l < 5; l++) {
                    if (this.cards[j].marked[k][l] == true) {
                        if (k == 0) {
                            a++;
                        } else if (k == 1) {
                            b++;
                        } else if (k == 2) {
                            c++;
                        } else if (k == 3) {
                            d++;
                        } else if (k == 4) {
                            e++;
                        }
                    }
                }
            }
        }
        if (a >=5||b>=5||c>=5||d>=5||e>=5){
            a=b=c=d=e = 0;
            return true;
        }
        else{
            a=b=c=d=e = 0;
            return false;
        }
    }

    public void markNumber(int number){
        for (int i = 0; i < this.cards.length; i++){
            cards[i].markNumber(number);
        }
    }
}
