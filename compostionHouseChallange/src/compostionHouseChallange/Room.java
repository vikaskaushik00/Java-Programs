package compostionHouseChallange;

public class Room {
    private int width;
    private int length;
    private Bed bed;
    private int noWindow;
    private int noSofa;

    public Room (int width, int length, Bed bed, int noWindow, int noSofa){
        this.width = width;
        this.length = length;
        this.bed = bed;
        this.noWindow = noWindow;
        this.noSofa = noSofa;
    }

    public void areaWindow(){
        System.out.println("The area of window of the room is : "+this.width * this.length);
    }

    public int getWidth(){
        return this.width;
    }
    public int getLength(){
        return this.length;
    }
    public Bed getBed(){
        return this.bed;
    }
    public int getNoWindow(){
        return this.noWindow;
    }
    public int getNoSofa(){
        return this.noSofa;
    }
}
