package compostionHouseChallange;

public class Bed {
    private int width;
    private int length;

    public Bed(int width, int  length){
        this.width = width;
        this.length = length;

    }
    public void bedArea(){
        System.out.println("The area of bed is : "+this.width * this.length);
    }

    public int getWidth(){
        return this.width;
    }
    public int getLength(){
        return this.length;
    }
}
