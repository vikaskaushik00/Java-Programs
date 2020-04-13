package compostionHouseChallange;

public class Main {

    public static void main(String[] args) {

        Room room = new Room(5,6,new Bed(6,6),1,1);

        House house = new House(room);
        house.all();

    }
}
