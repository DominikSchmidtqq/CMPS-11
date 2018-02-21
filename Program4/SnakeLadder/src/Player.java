/**
 * Created by domin on 2/20/2018.
 */
class Player {
    String name;
    int position;
    public Player(String name){
        this.name = name;
    }
    public void setPosition(int position){
        this.position = position;
    }
    public int getPosition(){
        return this.position;
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        return ""+this.getName()+" @ "+this.getPosition();
    }
}
