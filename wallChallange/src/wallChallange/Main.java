package wallChallange;

public class Main {

    public static void main(String[] args) {
        Wall area = new Wall();
        System.out.println("area = "+area.getArea());
        area.setHeight(-1);
        System.out.println("Width = "+area.getWidth());
        System.out.println("Height = "+area.getHeight());
        System.out.println("Area = "+area.getArea());

    }
}