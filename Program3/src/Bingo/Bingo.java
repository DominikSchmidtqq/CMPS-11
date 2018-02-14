package Bingo;

import java.util.Random;

/**
 * Created by domin on 2/12/2018.
 */

public class Bingo {
    String winners ="";
    Player[] players;
    public Bingo(Player[] players){
            this.players = players;
        }
    public Bingo(){
            this(new Player[0]);
        }
    public String play(int number){
        for (int i = 0; i <players.length; i++){
            players[i].markNumber(number);
            if (players[i].isWinner() == true)
                winners = winners + (players[i].getName()) +" ";
        }
        return winners;
    }
}

