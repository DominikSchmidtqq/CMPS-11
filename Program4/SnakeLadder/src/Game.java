/**
        * Created by domin on 2/20/2018.

*/
public class Game {
    Board board;
    Player[] players;
    public Game(Board board, Player[] players){
        this.board = board;
        this.players = players;
    }
    public Game(Player[] players){
        new Game(new Board(10),players);
    }
    public Player currentPlayer(){
        return this.players[0];
    }
    public void addPlayer(Player p){
        Player[] temp = new Player[this.players.length];
        for(int i = 0; i< this.players.length; i++){
            temp[i] = this.players[i];
        }
        temp[temp.length-1] = p;
        this.players = temp;
    }
    public boolean winner(){
        return false;
    }
    public void movePlayer(int n){
        this.currentPlayer().setPosition(this.currentPlayer().getPosition()+n);
    }
    public boolean play(int moveCount){
        return true;
    }
    public Board getBoard(){
        return this.board;
    }
}
