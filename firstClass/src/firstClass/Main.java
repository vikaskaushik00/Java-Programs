package firstClass;

public class Main {

    public static void main(String[] args) {
        Car tata = new Car();
        tata.setModel("Nexon");
        tata.setTyre(4);
        tata.setColour("Red");
        tata.setSeat(5);
        System.out.println("Model is : "+tata.getModel());
        System.out.println("Number of tyre are : " +tata.getTyre());
        System.out.println("Number of seat are : " + tata.getSeat());
        System.out.println("colour of body is : "+tata.getColour());
    }
}
