public class Path1 {
    int[] points;

    Path1(){
        this( new int[0]);
    }
    Path1(int[] p){
        this.points = p;
    }
    public Path1 addPoint(int x, int y){
        int[] array1 = new int[this.points.length+2];
        for (int i = 0; i < this.points.length; i++){
            array1[i] = this.points[i];
        }
        this.points = array1;
        this.points[this.points.length-2]=x;
        this.points[this.points.length-1]=y;
        Path1 temp = new Path1(this.points);
        return temp;
    }
    public boolean removePoint(int index){
        if (index <= this.points.length/2){
            int[] newArray = new int[this.points.length-2];
            for(int i=0; i< index*2;i++){
                newArray[i] = this.points[i];
            }
            for (int i = index*2; i < newArray.length-1;i++){
                newArray[i] = this.points[i+2];
            }
            this.points = newArray;
            return true;
        }
        return false;
    }
    void addPath(Path1 p){
        int length = this.points.length + p.points.length;
        int[] newArray = new int[length];
        for(int i)
    }
    public static void main(String args[]){
        Path1 path = new Path1();
        path.addPoint(0,0);
        path.addPoint(1,1);
        path.removePoint(1);
        System.out.println(path.points[1]);
    }
}
