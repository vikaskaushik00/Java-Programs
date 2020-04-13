package pointChallange;

public class Point {
    private int x ,y;


    public Point(){

    }
    public Point(int x,int y){
        setX(x);
        setY(y);
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;

    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public double distance(){
        double distance = Math.sqrt(((0 - x) * (0 - x)) + ((0 - y) * (0 - y)));
        return distance;
    }
    public double distance(int x,int y){
        double distance = Math.sqrt ((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
        return distance;
    }
    public double distance(Point p){
        double distance = Math.sqrt((p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y));
        return distance;
    }

}
