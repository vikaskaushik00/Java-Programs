package compostionHouseChallange;

public class House {
    private Room room;
    public House(Room room){
        this.room = room;
    }

    public void all(){
        theWindow();
        theBed();
    }

    private void theWindow(){
        room.areaWindow();
    }
    private void theBed(){
        room.getBed().bedArea();
    }

    private Room getRoom(){
        return this.room;
    }
}
